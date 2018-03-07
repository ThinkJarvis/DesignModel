package com.xiaomi.mmemento.blackMemento;

import android.util.Log;

import com.xiaomi.mmemento.BaseInfo;
import com.xiaomi.mmemento.whiteMemento.WhiteMemento;

/**
 * Created by admin on 2018/2/14.
 */

public class BlackOriginator extends BaseInfo{


    public BlackMemento saveWhiteMemento() {
        BlackMemento blackMemento = new BlackMemento();
        blackMemento.setState(getState());
        blackMemento.setStatus(getStatus());
        return blackMemento;
    }

    public void restoreWhiteMemento(BlackMementoIF blackMementoIF) {
        this.setStatus(((BlackMemento)blackMementoIF).getStatus());
        this.setState(((BlackMemento)blackMementoIF).getState());
    }

    public void show() {
        Log.e("wjq",this.getClass().getSimpleName() + " | " +  state + " | " + status);
    }

    private class BlackMemento extends BaseInfo implements BlackMementoIF {

    }

}
