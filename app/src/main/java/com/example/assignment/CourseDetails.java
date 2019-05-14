package com.example.assignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CourseDetails extends AppCompatActivity {

    TextView txt1,txt2,txt3,txt4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_details);

        txt1 = findViewById(R.id.et1);
        txt2 = findViewById(R.id.et2);
        txt3 = findViewById(R.id.et3);
        txt4 =findViewById(R.id.et4);
        Intent intent = getIntent();
        String message = intent.getStringExtra("data");
        //condition
        if (message.contentEquals("Test Automation"))
        {
            txt1.setText("CS1001");
            txt2.setText("Test Auntomation");
            txt3.setText("3");
            txt4.setText("Sir Amir Imam");
        }
        else if (message.contentEquals("Data Structure"))
        {
            txt1.setText("CS1002");
            txt2.setText("Data Structure");
            txt3.setText("3");
            txt4.setText("Miss Hira Farman");
        }

        else if (message.contentEquals("Computer Programming"))
        {txt1.setText("CS1003");
            txt2.setText("Computer Programming");
            txt3.setText("3 + 1");
            txt4.setText("Sir Saqib Riaz");
        }
        else if (message.contentEquals("Artificial Intelligence"))
        {
            txt1.setText("CS1004");
            txt2.setText("Artificial Intelligence");
            txt3.setText("3 + 1");
            txt4.setText("Sir Ahmed Raza");
        }
        else if (message.contentEquals("Principles Of Management"))
        {
            txt1.setText("CS1005");
            txt2.setText("Principles Of Management");
            txt3.setText("2");
            txt4.setText("Sir Humair Ali");
        }
        else if (message.contentEquals("Mobile Apllication & Development"))
        {
            txt1.setText("CS1006");
            txt2.setText("Mobile Apllication & Development");
            txt3.setText("3");
            txt4.setText("Sir Asad Ahsan");
        }
        else if (message.contentEquals("Operating System"))
        {
            txt1.setText("CS1007");
            txt2.setText("Operating System");
            txt3.setText("2 + 1");
            txt4.setText("Sir Osama Ahmed Khan");
        }
        else if (message.contentEquals("Software Engineering"))
        {
            txt1.setText("CS1008");
            txt2.setText("Software Engineering");
            txt3.setText("3");
            txt4.setText("Sir Ubaid Chawla");
        }
        else if (message.contentEquals("Compiler Construction"))
        {
            txt1.setText("CS1009");
            txt2.setText("Compiler Construction");
            txt3.setText("2 + 1");
            txt4.setText("Miss Nazish Nauman");
        }

    }
}

