package rfa.hadis;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityBacaHadits extends AppCompatActivity {

    Button button2;
    Button hadis1,hadis2, hadis3,hadis4,hadis5,hadis6,hadis7,hadis8,hadis9,hadis10,hadis11,hadis12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baca_hadits);

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityBacaHadits.this, MainActivity.class);
                ActivityBacaHadits.this.startActivity(intent);
                ActivityBacaHadits.this.finish();
            }
        });

        hadis1 = (Button) findViewById(R.id.hadis1);
        hadis1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityBacaHadits.this, ActivityHadits1.class);
                ActivityBacaHadits.this.startActivity(intent);
                ActivityBacaHadits.this.finish();
            }
        });

        hadis2 = (Button) findViewById(R.id.hadis2);
        hadis2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityBacaHadits.this, ActivityHadits2.class);
                ActivityBacaHadits.this.startActivity(intent);
                ActivityBacaHadits.this.finish();
            }
        });

        hadis3 = (Button) findViewById(R.id.hadis3);
        hadis3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityBacaHadits.this, ActivityHadits3.class);
                ActivityBacaHadits.this.startActivity(intent);
                ActivityBacaHadits.this.finish();
            }
        });
        hadis4 = (Button) findViewById(R.id.hadis4);
        hadis4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityBacaHadits.this, ActivityHadits4.class);
                ActivityBacaHadits.this.startActivity(intent);
                ActivityBacaHadits.this.finish();
            }
        });
        hadis5 = (Button) findViewById(R.id.hadis5);
        hadis5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityBacaHadits.this, ActivityHadits5.class);
                ActivityBacaHadits.this.startActivity(intent);
                ActivityBacaHadits.this.finish();
            }
        });
        hadis6 = (Button) findViewById(R.id.hadis6);
        hadis6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityBacaHadits.this, ActivityHadits6.class);
                ActivityBacaHadits.this.startActivity(intent);
                ActivityBacaHadits.this.finish();
            }
        });
        hadis7 = (Button) findViewById(R.id.hadis7);
        hadis7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityBacaHadits.this, ActivityHadits7.class);
                ActivityBacaHadits.this.startActivity(intent);
                ActivityBacaHadits.this.finish();
            }
        });
        hadis8 = (Button) findViewById(R.id.hadis8);
        hadis8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityBacaHadits.this, ActivityHadits8.class);
                ActivityBacaHadits.this.startActivity(intent);
                ActivityBacaHadits.this.finish();
            }
        });
        hadis9 = (Button) findViewById(R.id.hadis9);
        hadis9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityBacaHadits.this, ActivityHadits9.class);
                ActivityBacaHadits.this.startActivity(intent);
                ActivityBacaHadits.this.finish();
            }
        });
        hadis10 = (Button) findViewById(R.id.hadis10);
        hadis10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityBacaHadits.this, ActivityHadits10.class);
                ActivityBacaHadits.this.startActivity(intent);
                ActivityBacaHadits.this.finish();
            }
        });

        hadis11 = (Button) findViewById(R.id.hadis11);
        hadis11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityBacaHadits.this, ActivityHadits11.class);
                ActivityBacaHadits.this.startActivity(intent);
                ActivityBacaHadits.this.finish();
            }
        });
        hadis12 = (Button) findViewById(R.id.hadis12);
        hadis12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityBacaHadits.this, ActivityHadits12.class);
                ActivityBacaHadits.this.startActivity(intent);
                ActivityBacaHadits.this.finish();
            }
        });
    }
}
