package com.fwts.tutionhub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Dashboard extends AppCompatActivity {
    CardView institute, teacher, student, parent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        institute = (CardView) findViewById(R.id.instituteview);
        teacher = (CardView) findViewById(R.id.teacherview);
        student = (CardView) findViewById(R.id.studentView);
        parent = (CardView) findViewById(R.id.parentView);

        institute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this,Login.class);
                intent.putExtra("user","Institute");
                startActivity(intent);
            }
        });

        teacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this,Login.class);
                intent.putExtra("user","Teacher");
                startActivity(intent);
            }
        });

        student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this,Login.class);
                intent.putExtra("user","Student");
                startActivity(intent);
            }
        });

        parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this,Login.class);
                intent.putExtra("user","Parent");
                startActivity(intent);
            }
        });

    }

    private void ShowMessage() {
        Toast.makeText(this, "Working", Toast.LENGTH_SHORT).show();
    }
}