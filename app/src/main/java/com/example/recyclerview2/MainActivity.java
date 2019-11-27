package com.example.recyclerview2;

import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerview);

        List<Students> studentsList=new ArrayList<>();
        studentsList.add(new Students("Ram Prashad","22","KTM","Male",R.drawable.male));
        studentsList.add(new Students("Rani Kumari","20","Kirtipur","Female",R.drawable.female));

        StudentAdapter studentAdapter=new StudentAdapter(this,studentsList);
        recyclerView.setAdapter(studentAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
