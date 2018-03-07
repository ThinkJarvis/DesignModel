package com.designmodel;

import android.util.Log;

import com.mabstractfactory.factory.HpFactory;
import com.mabstractfactory.factory.PCFactory;
import com.mabstractfactory.product.Keyboard;
import com.mabstractfactory.product.Mouse;
import com.mbuilder.javaBuilder.BuilderDirector;
import com.mbuilder.javaBuilder.ManBuilder;
import com.mbuilder.javaBuilder.WomanBuilder;
import com.mdecorator.Person;
import com.mdecorator.ShirtDecorate;
import com.mdecorator.ShoeDecorate;
import com.mfacade.Facade;
import com.mfactorymethod.IFactory;
import com.mfactorymethod.IOperation;
import com.mfactorymethod.SubFactory;
import com.mprototype.deepprototype.DeepPrototype;
import com.mprototype.lightprototype.LightPrototype;
import com.mproxy.reflectproxy.ISubject;
import com.mproxy.reflectproxy.ProxyHandler;
import com.mproxy.reflectproxy.RealSubject;
import com.mproxy.staticproxy.Proxy;
import com.mstaticfactory.ISuperCar;
import com.mstaticfactory.SimpleFactory;
import com.mstrategy.FullCutStrategy;
import com.mstrategy.HalfPriceStrategy;
import com.mstrategy.IPriceStrategy;
import com.mstrategy.PurchaseStrategy;
import com.mstrategy.StrategyFactory;
import com.msubscribe.delegateSubcribe.ObserverA;
import com.msubscribe.delegateSubcribe.ObserverB;
import com.msubscribe.javaSubscribe.ConcreteObserver;
import com.msubscribe.javaSubscribe.ConcreteSubject;
import com.msubscribe.javaSubscribe.Observer;
import com.msubscribe.javaSubscribe.Subject;
import com.mtemplatemethod.ChildClassA;
import com.mtemplatemethod.ChildClassB;
import com.mtemplatemethod.SuperClass;
import com.xiaomi.madapter.ClassAdapter;
import com.xiaomi.madapter.ObjectAdapter;
import com.xiaomi.madapter.Target;
import com.xiaomi.madapter.android.MyAdapter;
import com.xiaomi.mmemento.whiteMemento.WhiteCaretaker;
import com.xiaomi.mmemento.whiteMemento.WhiteOriginator;
import com.xiaomi.mstate.StateDecode;

/**
 * Created by admin on 2017/12/25.
 */

public class DesignFacade {

    //简单工厂
    public void loadStaticFactory() {
        SimpleFactory simpleFactory = SimpleFactory.getInstance();
        ISuperCar iSuperCar = simpleFactory.switchWhichCar("Pagani");
        Log.e("wjq",iSuperCar.getModel());
    }

    //策略模式
    public void loadStrategy() {
        float price = 90.0f;
        IPriceStrategy iPriceStrategy = null;
        if (price >= 0 && price < 100) {
            iPriceStrategy = new HalfPriceStrategy();
        }else {
            iPriceStrategy = new FullCutStrategy();
        }
        PurchaseStrategy purchaseStrategy = new PurchaseStrategy(iPriceStrategy);
        Log.e("wjq","价格为 = " + purchaseStrategy.countPrice(price));
    }

    //策略模式与简单工厂相结合
    public void loadStrategyWithStaticFactory() {
        float price = 90.0f;
        StrategyFactory strategyFactory = StrategyFactory.getInstance();
        IPriceStrategy iPriceStrategy1 = strategyFactory.chooseWhichStrategy(price);
        PurchaseStrategy purchaseStrategy1 = new PurchaseStrategy(iPriceStrategy1);
        Log.e("wjq","价格为 = " + purchaseStrategy1.countPrice(price));
    }

    //装饰模式
    public void loadDecorator() {
        Person person = new Person();
        ShoeDecorate shoeDecorate = new ShoeDecorate(person);
        ShirtDecorate shirtDecorate = new ShirtDecorate(shoeDecorate);
        Log.e("wjq",shirtDecorate.dress()+"");
    }

    //静态代理
    public void loadStaticProxy() {
        Proxy proxy = new Proxy();
        Log.e("wjq","请求方式: " + proxy.doRequest());
    }

    //JDK动态代理
    public void loadReflectProxy() {
        RealSubject realSubject = new RealSubject();
        ProxyHandler proxyHandler = new ProxyHandler(realSubject);
        ISubject iSubjectProxy = (ISubject) java.lang.reflect.Proxy.newProxyInstance(
                realSubject.getClass().getClassLoader(),
                realSubject.getClass().getInterfaces(),
                proxyHandler);
        Log.e("wjq","请求方式: " + iSubjectProxy.doRequest());
    }

    // 工厂模式
    public void loadFactoryMethod() {
        IFactory iFactory = new /*AddFactory()*/SubFactory();
        IOperation iOperation = iFactory.createOperation();
        iOperation.mNumberA = 11f;
        iOperation.mNumberB = 2f;
        Log.e("wjq","计算结果: " +iOperation.getResult());
    }

    //原型模式-浅复制
    public void loadLightPrototype() {
        LightPrototype personA = new LightPrototype();
        personA.setPersonInfo("A","男","18");
        personA.setWorkExperience("XX公司","2");
        LightPrototype personB = personA.clone();
        personB.setName("B");
        personB.setWorkExperience("YY公司","4");
        personA.display();
        personB.display();
    }

    //原型模式-深复制
    public void loadDeepPrototype() {
        DeepPrototype personC = new DeepPrototype();
        personC.setPersonInfo("C","女","18");
        personC.setWorkExperience("WW公司","3");
        DeepPrototype personD = personC.clone();
        personD.setName("D");
        personD.setWorkExperience("ZZ公司","5");
        personC.display();
        personD.display();
    }

    //模板方法
    public void loadTemplateMethod() {
        SuperClass childClassA = new ChildClassA();
        SuperClass childClassB = new ChildClassB();
        childClassA.templateMethod();
        childClassB.templateMethod();
    }


    //外观模式
    public void loadFacade() {
        Facade facade = new Facade();
        facade.methodAdd();
        facade.methodLess();
    }

    //java建造者模式
    public void loadJavaBuilder() {
        BuilderDirector builderDirector = new BuilderDirector();
        com.mbuilder.javaBuilder.Person man = builderDirector.Construct(new ManBuilder());
        com.mbuilder.javaBuilder.Person woman = builderDirector.Construct(new WomanBuilder());
        Log.e("wjq",man.getDes() + " || " + woman.getDes());
    }

    //android建造者模式
    public void loadAndroidBuilder() {
        com.mbuilder.androidBuilder.Person man = new com.mbuilder.androidBuilder.Person.Builder()
                .setHead("男人的头")
                .setBody("男人的身体")
                .setFoot("男人的脚")
                .create();

        com.mbuilder.androidBuilder.Person woman = new com.mbuilder.androidBuilder.Person.Builder()
                .setHead("女人的头")
                .setBody("女人的身体")
                .setFoot("女人的脚")
                .create();

        Log.e("wjq",man.getDes() + " || " + woman.getDes());
    }

    //java 观察者模式
    public void loadJavaSubscribe() {
        Subject subject = new ConcreteSubject();
        Observer observerA = new ConcreteObserver();
        Observer observerB = new ConcreteObserver();
        //订阅消息
        subject.attach(observerA);
        subject.attach(observerB);
        //发布消息
        subject.publish();
        //解除订阅
        subject.detach(observerA);
        subject.publish();

    }

    //java 事件委托
    public void loadDelegateSubscribe() {
        ObserverA observerA = new ObserverA();
        ObserverB observerB = new ObserverB();
        com.msubscribe.delegateSubcribe.ConcreteSubject  concreteSubject =
                new com.msubscribe.delegateSubcribe.ConcreteSubject();
        concreteSubject.attach(observerA,"actionA");
        concreteSubject.attach(observerB,"actionB");
        concreteSubject.publish();

        concreteSubject.detach(observerA);
        concreteSubject.publish();
    }

    //抽象工厂
    public void loadAbstractFactory() {
        PCFactory pcFactory = new HpFactory() /*new DeilFactory()*/;
        Mouse mouse = pcFactory.createMouse();
        Keyboard keyboard = pcFactory.createKeyboard();
        Log.e("wjq",mouse.build() + " | " + keyboard.build());
    }

    //简单工厂改造抽象工厂
    public void loadAbstractFactoryWithSimpleFactory() {
        com.mabstractfactory.SimpleFactory simpleFactory = new com.mabstractfactory.SimpleFactory("Deil");
        Mouse mouse = simpleFactory.createMouse();
        Keyboard keyboard = simpleFactory.createKeyboard();
        Log.e("wjq",mouse.build() + " | " + keyboard.build());
    }

    //状态模式
    public void loadState() {
        StateDecode stateDecode = new StateDecode(StateDecode.weather_status.sun);
        stateDecode.handle();
    }

    //类适配器
    public void loadClassAdapter() {
        Target target = new /*ConcreteTarget()*/ ClassAdapter();
        target.request();
    }

    //对象适配器
    public void loadObjectAdapter() {
        Target target = new /*ConcreteTarget()*/ ObjectAdapter();
        target.request();
    }

    //缺省适配器
    public void loadDefaultAdapter() {
        MyAdapter myAdapter = new MyAdapter();

        myAdapter.getView();

        com.xiaomi.madapter.android.BaseAdapter baseAdapter = new com.xiaomi.madapter.android.BaseAdapter() {
            @Override
            public void getView() {
                Log.e("wjq","baseAdapter getView");
            }
        };

        baseAdapter.getView();
    }

    //白箱备忘录
    public void loadWhiteMemento() {
        WhiteOriginator whiteOriginator = new WhiteOriginator();
        whiteOriginator.setState("start");
        whiteOriginator.setStatus(0);
        whiteOriginator.show();

        WhiteCaretaker whiteCaretaker = new WhiteCaretaker();
        whiteCaretaker.setWhiteMemento(whiteOriginator.saveWhiteMemento());

        whiteOriginator.setState("end");
        whiteOriginator.setStatus(1);
        whiteOriginator.show();

        whiteOriginator.restoreWhiteMemento(whiteCaretaker.getWhiteMemento());
        whiteOriginator.show();
    }

    //黑箱备忘录
    public void loadBlackMemento() {

    }

}
