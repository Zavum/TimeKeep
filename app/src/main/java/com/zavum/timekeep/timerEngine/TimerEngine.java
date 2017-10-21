package com.zavum.timekeep.timerEngine;

import android.os.Handler;
import android.widget.TextView;

import com.zavum.timekeep.objects.objectInterfaces.Timer;

/**
 * Created by dakfu on 7/13/2017.
 */

public class TimerEngine {
    Runnable timerRunnable;
    Handler timerHandler;

    public TimerEngine(){
        timerHandler = new Handler();

    }

    public void startTimer(final Timer inputTimer, final TextView inputTextView){

        timerRunnable = new Runnable(){

            @Override
            public void run(){
                long millis = inputTimer.getTime();
                int seconds = (int) (millis / 1000);
                int minutes = seconds / 60;
                seconds = seconds % 60;

                inputTextView.setText(String.format("%d:%02d", minutes, seconds));

                timerHandler.postDelayed(this, 500);
            }
        };

        inputTimer.startTimer();

        timerHandler.postDelayed(timerRunnable,0);
    }

    public void stopTimer(Timer inputTimer){
        inputTimer.stopTimer();
        timerHandler.removeCallbacks(timerRunnable);
    }

}
