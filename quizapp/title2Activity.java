package jp.wings.nikkeibp.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class title2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title2);

        Button basicTheory = findViewById(R.id.basicTheory);
        basicTheory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),basicTheory.class);
                startActivity(intent);
            }
        });

        Button computerSystem = findViewById(R.id.computerSystem);
        computerSystem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),computerSystem.class);
                startActivity(intent);
            }
        });

        final Button technoloty1 = findViewById(R.id.technology1);
        technoloty1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),technologyStart.class);
                startActivity(intent);
            }
        });


        Button startButton = findViewById(R.id.technology2);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),technologyLast.class);
                startActivity(intent);
            }
        });


        Button beforeButton = findViewById(R.id.beforeButton);
        beforeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),title1Activity.class);
                startActivity(intent);
            }
        });

    }
}
