package com.qualidade.tecnico;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Button buttonOne = (Button) findViewById(R.id.button);




        buttonOne.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                openIR();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(this,ChooseActivity.class);
        startActivity(i);
    }

    public void openIR(){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }


}
