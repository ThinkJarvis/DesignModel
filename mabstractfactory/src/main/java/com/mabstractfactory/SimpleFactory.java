package com.mabstractfactory;

import com.mabstractfactory.factory.DeilFactory;
import com.mabstractfactory.factory.HpFactory;
import com.mabstractfactory.factory.PCFactory;
import com.mabstractfactory.product.DeilKeyboard;
import com.mabstractfactory.product.DeilMouse;
import com.mabstractfactory.product.HpKeyboard;
import com.mabstractfactory.product.HpMouse;
import com.mabstractfactory.product.Keyboard;
import com.mabstractfactory.product.Mouse;

/**
 * Created by admin on 2018/2/12.
 */

public class SimpleFactory {

    private String mType;

    public SimpleFactory(String type) {
        mType = type;
    }

    public Mouse createMouse() {
        Mouse mouse = null;
        switch (mType) {
            case "Hp":
                mouse = new HpMouse();
                break;

            case "Deil":
                mouse = new DeilMouse();
                break;

            default:
                break;
        }
        return mouse;
    }

    public Keyboard createKeyboard() {
        Keyboard keyboard = null;
        switch (mType) {
            case "Hp":
                keyboard = new HpKeyboard();
                break;

            case "Deil":
                keyboard = new DeilKeyboard();
                break;

            default:
                break;
        }
        return keyboard;
    }
}
