package com.fwts.tutionhub;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class Login extends AppCompatActivity {
    TextView userstatus;
    TextInputLayout userid,userpwd;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
//Intent Value Grab
        Intent intent = getIntent();
        String userValue = intent.getStringExtra("user");
        userstatus = (TextView) findViewById(R.id.userstatus);
        userstatus.setText(userValue);
//Get User Data
        userid = (TextInputLayout) findViewById(R.id.loginPhone);
        userpwd = (TextInputLayout) findViewById(R.id.loginPwd);
        loginBtn = (Button) findViewById(R.id.loginbtn);




        if (userValue.equals("Institute")){
            loginBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String user = userid.getEditText().getText().toString();
                    String pwd = userpwd.getEditText().getText().toString();
                    String status = null;
                    if (user.equals("7017") && pwd.equals("admin")){
                        Intent shifting = new Intent(Login.this,InstituteDashboard.class);
                        startActivity(shifting);
                        finish();
                    }else{
                        status = "PwdError";
                        ShowErrorMessage(status);
                    }
                }
            });

        }else if (userValue.equals("Teacher")){
            ShowMessageOfWorking();
        }else if (userValue.equals("Student")){
            ShowMessageOfWorking();
        }else if (userValue.equals("Parent")){
            ShowMessageOfWorking();
        }
    }

    private void ShowErrorMessage(String status) {
        Dialog errorPop;
        errorPop = new Dialog(Login.this);
        errorPop.setContentView(R.layout.error);
        Button okBtn = errorPop.findViewById(R.id.okexit);
        TextView heading = errorPop.findViewById(R.id.headingpopup);
        if (status.equals("PwdError")){
            heading.setText("Invalid ID or Password");
        }
        errorPop.show();

        okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                errorPop.cancel();
            }
        });

    }

    private void ShowMessageOfWorking(){
        Toast.makeText(this, "Working", Toast.LENGTH_SHORT).show();
    }
}