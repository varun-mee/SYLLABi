package com.aysinmee.syllabi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class Semester extends AppCompatActivity {

    public Button sem1;
    public Button sem2;
    public Button sem3;
    public Button sem4;
    public Button sem5;
    public Button sem6;

    public static int sem = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester);
        getSupportActionBar().setTitle("SEMESTERS");
        init();

    }

    public void init(){
        sem1 = (Button) findViewById(R.id.sem1);
        sem2 = (Button) findViewById(R.id.sem2);
        sem3 = (Button) findViewById(R.id.sem3);
        sem4 = (Button) findViewById(R.id.sem4);
        sem5 = (Button) findViewById(R.id.sem5);
        sem6 = (Button) findViewById(R.id.sem6);

        sem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sem = 1;
                Intent doThis = new Intent(Semester.this, Subjects.class);
                doThis.putExtra("text",sem);
                startActivity(doThis);
            }
        });

        sem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sem = 2;
                Intent doThis = new Intent(Semester.this, Subjects.class);
                doThis.putExtra("text",sem);
                startActivity(doThis);
            }
        });

        sem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sem = 3;
                Intent doThis = new Intent(Semester.this, Subjects.class);
                doThis.putExtra("text",sem);
                startActivity(doThis);
            }
        });

        sem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sem = 4;
                Intent doThis = new Intent(Semester.this, Subjects.class);
                doThis.putExtra("text",sem);
                startActivity(doThis);
            }
        });

        sem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sem = 5;
                Intent doThis = new Intent(Semester.this, Subjects.class);
                doThis.putExtra("text",sem);
                startActivity(doThis);
            }
        });

        sem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sem = 6;
                Intent doThis = new Intent(Semester.this, Subjects.class);
                doThis.putExtra("text",sem);
                startActivity(doThis);
            }
        });


    }
}
