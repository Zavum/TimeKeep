package com.zavum.timekeep.containers;

import com.zavum.timekeep.containers.containerInterfaces.ObjectContainer;
import com.zavum.timekeep.objects.objectInterfaces.Timer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by dakfu on 7/16/2017.
 */

public class TimerContainer implements ObjectContainer {

    protected ArrayList<Timer> timerList;

    public TimerContainer(){
        timerList = new ArrayList<Timer>();
    }
    @Override
    public void addItem(Object object) {

        timerList.add((Timer)object);
    }

    @Override
    public void removeItem(Object object) {
        timerList.remove(object);
    }

    @Override
    public Iterator getIter() {
        return timerList.iterator();
    }

}
