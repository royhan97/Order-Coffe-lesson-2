package com.example.roy.order2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void tambah (View view){
        TextView inputJumlah = (TextView) findViewById(R.id.nol);
        TextView totalHarga = (TextView) findViewById(R.id.harga);
        int banyak= Integer.parseInt(inputJumlah.getText().toString());
        int tambah=1;
        int cost=5;
        int total=banyak+tambah;
        banyak=banyak+1;
        int price=banyak*cost;
        inputJumlah.setText(Integer.toString(total));
        totalHarga.setText(Integer.toString(price));
    }

    public void kurang (View view){
        TextView totalHarga = (TextView) findViewById(R.id.harga);
        TextView inputJumlah = (TextView) findViewById(R.id.nol);
        int banyak= Integer.parseInt(inputJumlah.getText().toString());
        if(banyak==0){
            Toast.makeText(getApplicationContext(),"Silahkan tap botton +",Toast.LENGTH_SHORT).show();
        }
        else {
            int kurang = 1;
            int cost=5;
            int total = banyak - kurang;
            banyak=banyak-1;
            int price=banyak*cost;
            inputJumlah.setText(Integer.toString(total));
            totalHarga.setText(Integer.toString(price));
        }
    }

    public void order (View view){
        TextView totalHarga = (TextView) findViewById(R.id.harga);
        TextView Jumlah = (TextView) findViewById(R.id.nol);
        TextView summary = (TextView) findViewById(R.id.orderSummary);
        int harga= Integer.parseInt(totalHarga.getText().toString());
        int banyak= Integer.parseInt(Jumlah.getText().toString());
        String pesan1 = "Jumlah kopi dipesan : "+banyak;
        pesan1 = pesan1+"\nTotal harga                  : $"+harga;
        summary.setText(pesan1);
    }

}
