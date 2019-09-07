 package com.aptron.servicesinandroid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {

     TextView textView;

     private Intent serviceIntent;
     MyService myService;
     ServiceConnection connection;
     boolean isServiceBound;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("abhi","MainActivity thread id : "+Thread.currentThread().getId());

        textView = findViewById(R.id.textView);

        serviceIntent = new Intent(this,MyService.class);
    }

     public void serviceButton(View view) {
        switch (view.getId())
        {
            case R.id.button:
                startService(serviceIntent);
                break;
            case R.id.button2:
                stopService(serviceIntent);
                break;
            case R.id.button3:
              bindService();
                break;
            case R.id.button4:
                unbindService();
                break;
            case R.id.button5:
                setRandomNumber();
                break;




        }
     }


     private void bindService()
     {
         if(connection==null)
         {
             connection = new ServiceConnection() {
                 @Override
                 public void onServiceConnected(ComponentName name, IBinder service) {


                     MyService.MyServiceBinder myServiceBinder = (MyService.MyServiceBinder) service;
                     myService = myServiceBinder.getService();
                     isServiceBound = true;

                 }

                 @Override
                 public void onServiceDisconnected(ComponentName name) {

                     isServiceBound = false;

                 }
             };

             bindService(serviceIntent,connection,Context.BIND_AUTO_CREATE);
         }

     }
     private void unbindService()
     {
      if(isServiceBound)
      {
       unbindService(connection);
       isServiceBound= false;
      }
     }

     private void setRandomNumber()
     {
         if(isServiceBound)
         {
             textView.setText("Random Number "+myService.getRandomNumber());
         }
         else
         {
             textView.setText("Service not bound");
         }
     }
 }
