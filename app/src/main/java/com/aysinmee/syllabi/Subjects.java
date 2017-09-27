package com.aysinmee.syllabi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Subjects extends AppCompatActivity {

    public Button sub1;
    public Button sub2;
    public Button sub3;
    public Button sub4;
    public Button sub5;
    public Button sub6;

    public static int value = 0;

    public  String sem1 = "R.raw.sem1_subjects";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects);
        getSupportActionBar().setTitle("SUBJECTS");

        value = getIntent().getIntExtra("text",0);

        sub1 = (Button) findViewById(R.id.sub1);
        sub2 = (Button) findViewById(R.id.sub2);
        sub3 = (Button) findViewById(R.id.sub3);
        sub4 = (Button) findViewById(R.id.sub4);
        sub5 = (Button) findViewById(R.id.sub5);
        sub6 = (Button) findViewById(R.id.sub6);

        InputStream is;

        if(value==1) {
             is = this.getResources().openRawResource(R.raw.sem1_subjects);
        }
        else if(value==3) {
             is = this.getResources().openRawResource(R.raw.sem3_subjects);
        }
        else if(value==5){
             is = this.getResources().openRawResource(R.raw.sem5_subjects);
        }
        else{
             is = this.getResources().openRawResource(R.raw.notext);
        }

        String data = "";
        StringBuffer sb = new StringBuffer();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is));

        if(is != null){
            try{
                while((data = bufferedReader.readLine()) != null){
                    sb.append(data + "\n");
                }
                data = sb.toString();
                String subs[] = data.split("\\n");
                sub1.setText(subs[0]);
                sub2.setText(subs[1]);
                sub3.setText(subs[2]);
                sub4.setText(subs[3]);
                sub5.setText(subs[4]);
                sub6.setText(subs[5]);
                is.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }


    }
}
