package com.example.mac.konversimatauang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    EditText edt_angka;
    Button bt_yen, bt_pounds, bt_euro, bt_USD;
    TextView tv_hasil;

    double angka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_angka = (EditText) findViewById(R.id.ET_input);
        bt_yen = (Button) findViewById(R.id.RpToYen);
        bt_euro = (Button) findViewById(R.id.RpToEuro);
        bt_pounds = (Button) findViewById(R.id.RpToPounds);
        bt_USD = (Button) findViewById(R.id.RpToUSD);
        tv_hasil = (TextView) findViewById(R.id.TV_output);
    }

    public boolean cek(){
        if (edt_angka.getText().toString().isEmpty()){
            Toast.makeText(this, "Masukkan bilangan woiii", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    public void toYen(View v){
        if (!cek()){
            return;
        }

        try{
            angka = Double.parseDouble(edt_angka.getText().toString());
        }catch(Exception ex){
            Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show();
        }

        double hasil = angka / 125;
        tv_hasil.setText(NumberFormat.getCurrencyInstance(Locale.JAPAN).format(hasil));
        Toast.makeText(this, "1 Yen = Rp 125", Toast.LENGTH_SHORT).show();
    }

    public void toEuro(View v){
        if (!cek()){
            return;
        }

        try{
            angka = Double.parseDouble(edt_angka.getText().toString());
        }catch(Exception e){
            Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show();
        }

        double hasil = angka / 14103;
        tv_hasil.setText(NumberFormat.getCurrencyInstance(Locale.GERMANY).format(hasil));
        Toast.makeText(this, "1 Euro = Rp 14.103", Toast.LENGTH_SHORT).show();
    }

    public void toPounds(View v){
        if (!cek()){
            return;
        }

        try{
            angka = Double.parseDouble(edt_angka.getText().toString());
        }catch(Exception e){
            Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show();
        }

        double hasil = angka / 16618;
        tv_hasil.setText(NumberFormat.getCurrencyInstance(Locale.ENGLISH).format( hasil ));
        Toast.makeText(this, "1 poundsterling = Rp 16.618", Toast.LENGTH_SHORT).show();
    }

    public void toUSD(View v){
        if (!cek()){
            return;
        }

        try{
            angka = Double.parseDouble(edt_angka.getText().toString());
        }catch(Exception e){
            Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show();
        }

        double hasil = angka / 13260;
        tv_hasil.setText(NumberFormat.getCurrencyInstance(Locale.US).format(hasil));
        Toast.makeText(this, "1 U$D = Rp 13.260", Toast.LENGTH_SHORT).show();
    }
}