package com.zavum.timekeep.objects;

import com.zavum.timekeep.objects.objectInterfaces.Timer;

/**
 * Created by dakfu on 7/9/2017.
 */

public class JobTimer implements Timer {
    private long timeElapsed;
    private long startTime;
    private long stopTime;
    public JobTimer(){
        startTime = 0;
    }
    @Override
    public long getTime() {
        return timeElapsed;
    }

    @Override
    public void setTime(long inputTime) {
        timeElapsed = inputTime;
    }

    @Override
    public void startTimer() {
        startTime = System.currentTimeMillis();
    }

    @Override
    public void stopTimer() {
        stopTime = System.currentTimeMillis();
    }
}
