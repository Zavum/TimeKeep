package com.zavum.timekeep.Factories;

import com.zavum.timekeep.Factories.factoryInterfaces.TimerFactory;

/**
 * Created by dakfu on 7/13/2017.
 */

public class JobTimerFactory implements TimerFactory {
    @Override
    public TimerFactory getTimer() {
        return new JobTimerFactory();
    }
}
