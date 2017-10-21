package com.zavum.timekeep.objects.objectInterfaces;

/**
 * Created by dakfu on 7/9/2017.
 */

public interface Timer {
    public long getTime();
    public void setTime(long inputTime);
    public void startTimer();
    public void stopTimer();

}