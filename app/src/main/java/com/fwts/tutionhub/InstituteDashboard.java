package com.fwts.tutionhub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;

public class InstituteDashboard extends AppCompatActivity {

    CardView create, budget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_institute_dashboard);
        create = (CardView) findViewById(R.id.create);
        budget = (CardView) findViewById(R.id.budget);

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog popup;
                popup = new Dialog(InstituteDashboard.this);
                popup.setContentView(R.layout.error);
                popup.show();
            }
        });

        budget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}