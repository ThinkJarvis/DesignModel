package com.xiaomi.mstate;

/**
 * Created by admin on 2018/2/12.
 */

public class StateDecode {

    public enum weather_status {sun, rain}
    public State mState;

    public StateDecode(weather_status weatherStatus) {
        mState = createState(weatherStatus);
    }

    public void handle() {
        if (mState != null) {
            mState.handle();
        }
    }

    private State createState(weather_status status) {
        State state = null;
        switch (status) {
            case sun:
                state = new SunState();
                break;
            case rain:
                state = new RainState();
            default:
                break;
        }
        return state;
    }
}
