package com.startitup.phiraphon.paoyingchoop01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image = (ImageView)findViewById(R.id.imageView);
//        Button btnHammer = (Button)findViewById(R.id.btnHammer);
        Button btnPaper = (Button)findViewById(R.id.btnPaper);
        btnPaper.setOnClickListener(this);
        Button btnScissor = (Button)findViewById(R.id.btnScissors);
        btnScissor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setImageResource(R.drawable.scissors);
            }
        });
        Button btnRandom = (Button)findViewById(R.id.btnRandom);


    }

    public void btnHammer(View view){
        image.setImageResource(R.drawable.hammer);
    }

    public void onClick(View v){
        image.setImageResource(R.drawable.paper);
    }
}
