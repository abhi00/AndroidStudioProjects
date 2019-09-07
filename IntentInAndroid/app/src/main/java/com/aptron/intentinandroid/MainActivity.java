package com.aptron.intentinandroid;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.data);
    }

    public void intentEvent(View view) {

        Intent intent,chooser;
        switch (view.getId())
        {
            case R.id.web:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://aptronnoida.in/"));
               chooser= Intent.createChooser(intent,"Open WebSite");
               startActivity(chooser);
                break;
            case R.id.location:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo://@28.5852041,77.313314,15z"));
                chooser = Intent.createChooser(intent,"Open Map");
                startActivity(chooser);
                break;
            case R.id.feedback:
                intent = new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("mailto:"));
                String[] email={"hr@aptron.com","abhishek@aptron.com"};

                intent.putExtra(Intent.EXTRA_EMAIL,email);
                intent.putExtra(Intent.EXTRA_SUBJECT,"This is The Feedback Of Android Class");
                intent.putExtra(Intent.EXTRA_TEXT,"5 Star for Abhishek sir");
                intent.setType("text/plain");
                chooser = Intent.createChooser(intent,"Send FeedBack");
                startActivity(chooser);
                break;
            case R.id.dial:
                intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9090909909"));
                chooser = Intent.createChooser(intent,"Send FeedBack");
                startActivity(chooser);

                break;
            case R.id.share:
                intent=new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT,"You can download :https://play.google.com/store/apps/details?id=com.google.android.youtube&hl=en");
                intent.setType("text/plain");
                chooser=Intent.createChooser(intent,"share app");
                startActivity(chooser);
                break;
            case R.id.download:
                intent =new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.tencent.ig&hl=en_IN"));
                chooser = Intent.createChooser(intent,"Send FeedBack");
                startActivity(chooser);
                break;
            case R.id.whatsapp:
                intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT,"Hello Ji Kaise Ho...");
                intent.setPackage("com.whatsapp");
                intent.setType("text/plain");
                startActivity(intent);
                break;
            case R.id.expint:
                String data=et1.getText().toString();
                intent = new Intent(MainActivity.this,Home.class);
                intent.putExtra("name",data);
                startActivity(intent);
                break;


        }
    }
}
