package com.aptron.webviewinandroid;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
WebView webView;
Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = findViewById(R.id.web);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        webView.loadUrl("http://aptronnoida.in");
       WebSettings settings = webView.getSettings();
       settings.setJavaScriptEnabled(true);
       webView.setWebViewClient(new WebViewClient());


    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {

            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mymenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.home:
                Toast.makeText(this, "Click On Home Screen", Toast.LENGTH_SHORT).show();
                break;

            case R.id.set:
                Toast.makeText(this, "Click on Settings", Toast.LENGTH_SHORT).show();
                break;

            case R.id.noti:
                Toast.makeText(this, "Click on Notification", Toast.LENGTH_SHORT).show();
                break;
            case R.id.exit:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("Exit");
                builder.setMessage("App Band Karni Hai Kya?");
                builder.setPositiveButton("Ha ", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                      finish();
                    }
                });
                builder.setNegativeButton("Nahi", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Click Kyo Kiya Fir ??????", Toast.LENGTH_SHORT).show();
                    }
                });
                AlertDialog alertDialog =builder.create();
                alertDialog.show();
                break;

        }
        return true;
    }
}
