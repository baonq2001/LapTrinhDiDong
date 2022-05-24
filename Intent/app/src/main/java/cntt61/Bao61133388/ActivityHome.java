package cntt61.Bao61133388;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityHome extends AppCompatActivity {

    TextView tvUserName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        tvUserName = findViewById(R.id.tvUserName);
        //Lấy giá trị từ màn hình bên login gửi qua và gán giá trị vào textView
        tvUserName.setText(getIntent().getStringExtra("UserName"));
    }
}