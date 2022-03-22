package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edita,editb;
    TextView txtkq;
    Button btcong, bttru, btnhan, btchia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edita= (EditText) findViewById(R.id.eda);
        editb= (EditText) findViewById(R.id.edb);
        txtkq= (TextView) findViewById(R.id.txkq);
        btcong=(Button) findViewById(R.id.btncong);
        bttru=(Button) findViewById(R.id.btntru);
        btnhan=(Button) findViewById(R.id.btnnhan);
        btchia=(Button) findViewById(R.id.btnchia);
    }
    public void xulycong(View v){
        String sa= edita.getText().toString();
        String sb= edita.getText().toString();
        int a = Integer.parseInt(sa);
        int b=Integer.parseInt(sb);
        int tong=a+b;
        String chuoiTong= String.valueOf(tong);
        txtkq.setText("tổng là:"+chuoiTong);
    }
    public void xulytru(View v){
        String sa= edita.getText().toString();
        String sb= edita.getText().toString();
        int a = Integer.parseInt(sa);
        int b=Integer.parseInt(sb);
        int tru=a-b;
        String chuoiTru= String.valueOf(tru);
        txtkq.setText("trừ là:"+chuoiTru);
    }
    public void xulynhan(View v){
        String sa= edita.getText().toString();
        String sb= edita.getText().toString();
        int a = Integer.parseInt(sa);
        int b=Integer.parseInt(sb);
        int nhan=a*b;
        String chuoiNhan= String.valueOf(nhan);
        txtkq.setText("nhân là:"+chuoiNhan);
    }
    public void xulychia(View v){
        String sa= edita.getText().toString();
        String sb= edita.getText().toString();
        int a = Integer.parseInt(sa);
        int b=Integer.parseInt(sb);
        int chia=a/b;
        String chuoiChia= String.valueOf(chia);
        txtkq.setText("hiệu là:"+chuoiChia);
    }