package com.example.baikt2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioButton rb13, rb15, rb18;
    private Button btncacu;
    private TextView tv;

    public MainActivity()
    {

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.tv);
        btncacu = (Button) findViewById(R.id.btncacu);
        rb13 = (RadioButton) findViewById(R.id.rb13);
        rb15 = (RadioButton) findViewById(R.id.rb15);
        rb18 = (RadioButton) findViewById(R.id.rb18);

        btncacu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sa = tv.getText().toString();
                int a = Integer.parseInt(sa);
                if (rb13.isChecked()) {
                    Float F13 = Float.valueOf((a * 13) / 100);
                    tv.setText("Số tiền Tip nhân được là: " + F13);
                }
                else {
                    if (rb15.isChecked()) {
                        Float F15 = Float.valueOf((a * 15) / 100);
                        tv.setText("Số tiền Tip nhân được là: " + F15);
                    }else {
                        if (rb18.isChecked()) {
                            Float F18 = Float.valueOf((a * 18) / 100);
                            tv.setText("Số tiền Tip nhân được là: " + F18);
                        }
                    }
                }
            }
        });

        /*public void xulyTip(new View.OnClickListener(){
            @Override
                    public void onClick(View view) {
                String sa = editkq.getText().toString();
                int a = Integer.parseInt(sa);
                Float F13 = Float.valueOf((a * 13) / 100);
                Float F15 = Float.valueOf((a * 15) / 100);
                Float F18 = Float.valueOf((a * 18) / 100);
                if (rb13.isChecked()) {
                    editkq.setText("Số tiền Tip nhân được là: " + F13);
                }
            }
        });*/
    }
}