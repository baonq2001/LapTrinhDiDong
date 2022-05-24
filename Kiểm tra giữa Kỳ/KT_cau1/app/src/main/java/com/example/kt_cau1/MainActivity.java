package com.example.kt_cau1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    EditText editcanhday, editchieucao, editcanhA, editcanhB;
    TextView txtkq;
    Button btnChuVi, btnDienTich;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editcanhday = (EditText) findViewById(R.id.edtText_canhday);
        editchieucao = (EditText) findViewById(R.id.edtText_chieuCao);
        editcanhA = (EditText) findViewById(R.id.edtText_canhA);
        editcanhB = (EditText) findViewById(R.id.edtTextcanhB);
        txtkq = (TextView) findViewById(R.id.tvKetQua);
        btnChuVi = (Button) findViewById(R.id.btnChuVi);
        btnDienTich = (Button) findViewById(R.id.btnDienTich);
    }

    public void xulyChuVi(View v) {
        String sa = editcanhA.getText().toString();
        String sb = editcanhB.getText().toString();
        int a = Integer.parseInt(sa);
        int b = Integer.parseInt(sb);
        int ChuVi = (a + b)*2;
        String chuoitinhChuVi = String.valueOf(ChuVi);
        txtkq.setText("Chu Vi là:" + chuoitinhChuVi);
    }

    public void xulyDienTich(View v) {
        String sh = editcanhday.getText().toString();
        String sday = editchieucao.getText().toString();
        int h = Integer.parseInt(sh);
        int day = Integer.parseInt(sday);
        int DienTich = day * h;
        String chuoitinhDienTich = String.valueOf(DienTich);
        txtkq.setText("Diện tích là:" + chuoitinhDienTich);
    }

}