package com.example.string_in_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String str1, str2, str3, str4, str5, sr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void EnteredData(View view) {
        Button button = (Button)findViewById(R.id.SendButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText t1 = (EditText)findViewById(R.id.editText1);
                EditText t2 = (EditText)findViewById(R.id.editText2);
                EditText t3 = (EditText)findViewById(R.id.editText3);
                EditText t4 = (EditText)findViewById(R.id.editText4);
                EditText t5 = (EditText)findViewById(R.id.editText5);


                str1 = t1.getText().toString().trim();
                str1 = "1. " + str1;

                str2 = t2.getText().toString().trim();
                str2 = "2. " + str2;

                str3 = t3.getText().toString().trim();
                str3 = "3. " + str3;

                str4 = t4.getText().toString().trim();
                str4 = "4. " + str4;

                str5 = t5.getText().toString().trim();
                str5 = "5. " + str5;


                Bundle bundle = new Bundle();
                bundle.putString("s1", str1);
                bundle.putString("s2", str2);
                bundle.putString("s3", str3);
                bundle.putString("s4", str4);
                bundle.putString("s5", str5);

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtras(bundle);

                startActivity(intent);
            }
        });
    }
}