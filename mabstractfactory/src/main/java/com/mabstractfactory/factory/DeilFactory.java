package com.mabstractfactory.factory;

import com.mabstractfactory.product.DeilKeyboard;
import com.mabstractfactory.product.DeilMouse;
import com.mabstractfactory.product.Keyboard;
import com.mabstractfactory.product.Mouse;

/**
 * Created by admin on 2018/2/11.
 */

public class DeilFactory extends PCFactory {

    @Override
    public Mouse createMouse() {
        return new DeilMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new DeilKeyboard();
    }
}
