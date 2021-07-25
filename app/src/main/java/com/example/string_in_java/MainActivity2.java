package com.example.string_in_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    String str1, str2, str3, str4, str5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView v1 = (TextView) findViewById(R.id.textView3);
        TextView v2 = (TextView) findViewById(R.id.textView4);
        TextView v3 = (TextView) findViewById(R.id.textView5);
        TextView v4 = (TextView) findViewById(R.id.textView6);
        TextView v5 = (TextView) findViewById(R.id.textView7);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            str1 = bundle.getString("s1");
            str2 = bundle.getString("s2");
            str3 = bundle.getString("s3");
            str4 = bundle.getString("s4");
            str5 = bundle.getString("s5");

            v1.setText(str1);
            v2.setText(str2);
            v3.setText(str3);
            v4.setText(str4);
            v5.setText(str5);

        }
    }
}
