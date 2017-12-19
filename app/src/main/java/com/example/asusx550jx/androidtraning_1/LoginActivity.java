package com.example.asusx550jx.androidtraning_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import butterknife.BindView;

/**
 * Created by Asus X550JX on 12/19/2017.
 */

public class LoginActivity extends AppCompatActivity {
    //@BindView(R.id.edtUser)EditText username; ini untuk pakai library agar lebih rapih

    public static final String uname = "admin";
    public static final String pwd = "1234";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_form);

        Button btnLogin = (Button) findViewById(R.id.btnLogin); //bikin identifier untuk btnlogin
        final EditText username = (EditText) findViewById(R.id.edtUser); //sama kayak button
        final EditText password = (EditText) findViewById(R.id.edtPassword);
        btnLogin.setOnClickListener(new View.OnClickListener() { //setelah di identifier dipakai disini dengan set
            @Override                                            //onclick method
            public void onClick(View v) {
                if (validatePwd()) {
                    Intent i = new Intent(LoginActivity.this, MainActivity.class);
                    String user = username.getText().toString(); //username yg di identifier dipake disini
                    String pass = password.getText().toString();

                    i.putExtra("username", user); //ini untuk mengirimkan nilai yang ada di user ke berbagai form
                    startActivity(i);
                    finish();
                } else {
                    Toast.makeText(LoginActivity.this, "Username or Password is Invalid", Toast.LENGTH_LONG).show();
                }
            }
            private boolean validatePwd(){
                String user = username.getText().toString();
                String pass = password.getText().toString();
                if(user.equals(uname) && pass.equals(pwd)){
                    return true;
                } else {
                    return false;
                }
            }
        });
    }
}
