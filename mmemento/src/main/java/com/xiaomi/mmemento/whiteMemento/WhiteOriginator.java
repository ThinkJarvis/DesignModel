package com.xiaomi.mmemento.whiteMemento;

import android.util.Log;

import com.xiaomi.mmemento.BaseInfo;

/**
 * Created by admin on 2018/2/14.
 */

public class WhiteOriginator extends BaseInfo{
     private WhiteMemento mWhiteMemento;

    public WhiteMemento saveWhiteMemento() {
        mWhiteMemento = null;
        mWhiteMemento = new WhiteMemento();
        mWhiteMemento.setState(getState());
        mWhiteMemento.setStatus(getStatus());
        return mWhiteMemento;
    }

    public void restoreWhiteMemento(WhiteMemento whiteMemento) {
        setState(whiteMemento.getState());
        setStatus(whiteMemento.getStatus());
    }

    public void show() {
        Log.e("wjq",this.getClass().getSimpleName() + " | " +  state + " | " + status);
    }

}
