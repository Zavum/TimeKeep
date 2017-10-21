package com.zavum.timekeep.mediators;

import com.zavum.timekeep.Factories.JobTimerFactory;
import com.zavum.timekeep.Factories.factoryInterfaces.TimerFactory;
import com.zavum.timekeep.containers.TimerContainer;
import com.zavum.timekeep.containers.containerInterfaces.ObjectContainer;
import com.zavum.timekeep.objects.JobTimer;
import com.zavum.timekeep.objects.objectInterfaces.Timer;
import com.zavum.timekeep.timerEngine.TimerEngine;

/**
 * Created by dakfu on 7/16/2017.
 */

public class MainMediator {
    private TimerFactory timerFactory;
    private Timer jobTimer;
    private TimerEngine timerEngine;
    private ObjectContainer timerContainer;

    public MainMediator(){
            timerFactory = new JobTimerFactory();
            jobTimer = new JobTimer();
            timerEngine = new TimerEngine();
            timerContainer = new TimerContainer();
        }

        public void addTimer(){

        }
}
