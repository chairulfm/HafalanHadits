package rfa.hadis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {

    Button btn_baca;
    Button btn_hafalan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_baca = (Button) findViewById(R.id.btn_baca);
//        keluar = (Button) findViewById(R.id.keluar);
        btn_hafalan = (Button) findViewById(R.id.btn_hafalan);
        Button btn_infoaplikasi = (Button) findViewById(R.id.btn_infoaplikasi);

        btn_baca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityBacaHadits.class);
                MainActivity.this.startActivity(intent);
                MainActivity.this.finish();
            }
        });

        btn_hafalan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityHafalan.class);
                MainActivity.this.startActivity(intent);
                MainActivity.this.finish();
            }
        });

        btn_infoaplikasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityInfoAplikasi.class);
                MainActivity.this.startActivity(intent);
                MainActivity.this.finish();
            }
        });

//        keluar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                finish();
//            }
//        });
    }
}
