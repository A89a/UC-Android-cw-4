package com.example.car;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<Student> stdList = new ArrayList<>();
    int currentStud=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView name;
        TextView age;
        TextView grade;
        ImageView photo;
        Button nextStd;

        name=findViewById(R.id.textViewName);
        age=findViewById(R.id.textViewAge);
        grade=findViewById(R.id.textViewGrade);
        photo=findViewById(R.id.imageViewPhoto);
        nextStd=findViewById(R.id.nextStudent);

        Student stud1= new Student("Ali",7,75,R.drawable.std1);
        Student stud2= new Student("Qais",6,70,R.drawable.std2);
        Student stud3= new Student("Rana",5,80,R.drawable.std3);

        stdList.add(stud1);
        stdList.add(stud2);
        stdList.add(stud3);

        name.setText(stdList.get(currentStud).getStudentName());
        age.setText(stdList.get(currentStud).getStudentAge()+"");
        grade.setText(stdList.get(currentStud).getStudentGrade()+"");
        photo.setImageResource(stdList.get(currentStud).getStudentImg());

        nextStd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentStud++;
                if(currentStud== stdList.size()) {
                    currentStud = 0;
                }
                name.setText(stdList.get(currentStud).getStudentName());
                age.setText(stdList.get(currentStud).getStudentAge()+"");
                grade.setText(stdList.get(currentStud).getStudentGrade()+"");
                photo.setImageResource(stdList.get(currentStud).getStudentImg());

            }
        });









    }
}