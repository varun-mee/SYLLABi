package com.aysinmee.syllabi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Content extends AppCompatActivity {

    public LinearLayout layout;

    public Button content;

    public static int sub = 0;
    public static int unit = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String subs[]={};
        int size=0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
        getSupportActionBar().setTitle("CONTENT");

        sub = getIntent().getIntExtra("text", 0);

        layout = (LinearLayout) findViewById(R.id.layoutButtons);

        InputStream is;

        if(sub==1) {
            is = this.getResources().openRawResource(R.raw.sem1_sub1);
        }
        else if(sub==2){
            is = this.getResources().openRawResource(R.raw.sem1_sub2);
        }
        else if(sub==3){
            is = this.getResources().openRawResource(R.raw.sem1_sub3);
        }
        else if(sub==4){
            is = this.getResources().openRawResource(R.raw.sem1_sub4);
        }
        else if(sub==5){
            is = this.getResources().openRawResource(R.raw.sem1_sub5);
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
                subs = data.split("\\|");
                 size = subs.length;

                is.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        for(int i =0; i<size; i++){
            content = new Button(Content.this);
            content.setId(i+1);
            content.setText(subs[i]);
            content.setTag(i);
            content.setTextSize(15);
            layout.addView(content);
        }


    }
}
