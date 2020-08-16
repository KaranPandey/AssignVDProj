package com.example.assignvdproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class First_Page extends AppCompatActivity {
    private Button btngo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first__page);
        btngo = (Button) findViewById(R.id.gotobutton);

        btngo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(First_Page.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}