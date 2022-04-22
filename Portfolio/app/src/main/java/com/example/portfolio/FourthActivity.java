package com.example.portfolio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FourthActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_fourth);
        Button butt1 = (Button) findViewById(R.id.button);
        Button butt2 = (Button) findViewById(R.id.button1);
        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(FourthActivity.this, SecondActivity.class);
                startActivity(int1);
            }
        });
        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2 = new Intent(FourthActivity.this, ThirdActivity.class);
                startActivity(int2);
            }
        });
    }
    public void sendMessage(View view) {
        Toast.makeText(this, "Pesan telah terkirim", Toast.LENGTH_SHORT).show();
    }
}
