package com.aptron.servicesinandroid;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

import java.util.Random;

public class MyService  extends Service {


    private int mRamdomNumber;
    private boolean mIsRandomGeneratorOn;
    private final int MIN = 0;
    private final int MAX = 100;


    class MyServiceBinder extends Binder {
        public MyService getService() {
            return MyService.this;
        }
    }


    private IBinder mIBinder= new MyServiceBinder();

    @Override
    public IBinder onBind(Intent intent)
    {
        Log.d("abhi","InOnBind");
        return mIBinder;
    }

    @Override
    public void onRebind(Intent intent) {
        super.onRebind(intent);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        stopRandomNumberGenerator();
        Log.d("abhi","Service Destroyed");

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("abhi","In OnStartCommand thread id : "+Thread.currentThread().getId());
      //  stopSelf();

        mIsRandomGeneratorOn=true;
        new Thread(new Runnable() {
            @Override
            public void run() {
                startRandomNumberGenerator();
            }
        }).start();
        return START_STICKY;
    }


    private void stopRandomNumberGenerator()
    {

        mIsRandomGeneratorOn = false;
    }

    private void startRandomNumberGenerator()
    {
        while (mIsRandomGeneratorOn)
        {
          try {
              Thread.sleep(1000);
              if (mIsRandomGeneratorOn)
              {
                  mRamdomNumber = new Random().nextInt(MAX)+MIN;
                  Log.i("abhi","Thread ID:"+Thread.currentThread().getId()+" , Random Number: "+mRamdomNumber);
              }
          } catch (InterruptedException e) {
              Log.i("abhi","Thread intrrupted ");


          }

        }


    }

    @Override
    public boolean onUnbind(Intent intent) {

        Log.d("abhi","In onUnbind");
        return super.onUnbind(intent);
    }

    public int getRandomNumber()
    {
        return mRamdomNumber;
    }
}
