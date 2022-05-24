package cntt61.Bao61133388;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Tạo 1 Intent để chuuyeenr từ màn hình hiện hành (tham số đầu tiên là màn hiện hành) sang màn hình cần chuyển đến là tham số thứ 2
                Intent iLogin = new Intent(MainActivity.this,ActivityLogin.class);
                //Bắt đầu chuyển màn hình
                startActivity(iLogin);
            }
        });
    }
}