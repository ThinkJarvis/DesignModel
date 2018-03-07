package com.mfacade;


import android.util.Log;

public class Facade {
    private SubSystemOne subSystemOne;
    private SubSystemTwo subSystemTwo;

    public Facade() {
        subSystemOne = new SubSystemOne();
        subSystemTwo = new SubSystemTwo();
    }

    public void methodAdd() {
        int result = subSystemOne.MethodOne() + subSystemTwo.MethodTwo();
        Log.e("wjq","methodAdd = " + result);
    }

    public void methodLess() {
        int result = subSystemOne.MethodOne() - subSystemTwo.MethodTwo();
        Log.e("wjq","methodLess = " + result);
    }

}
