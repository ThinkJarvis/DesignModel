package com.designmodel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DesignFacade designFacade = new DesignFacade();

        designFacade.loadStaticFactory();

        designFacade.loadStrategy();

        designFacade.loadStrategyWithStaticFactory();

        designFacade.loadDecorator();

        designFacade.loadStaticProxy();

        designFacade.loadReflectProxy();

        designFacade.loadFactoryMethod();

        designFacade.loadLightPrototype();

        designFacade.loadDeepPrototype();

        designFacade.loadTemplateMethod();

        designFacade.loadTemplateMethod();

        designFacade.loadFacade();

        designFacade.loadJavaBuilder();

        designFacade.loadAndroidBuilder();

        designFacade.loadJavaSubscribe();

        designFacade.loadDelegateSubscribe();

        designFacade.loadAbstractFactory();

        designFacade.loadAbstractFactoryWithSimpleFactory();

        designFacade.loadState();

        designFacade.loadClassAdapter();

        designFacade.loadObjectAdapter();

        designFacade.loadDefaultAdapter();

        designFacade.loadWhiteMemento();


    }
}
