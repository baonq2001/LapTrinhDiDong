package cntt61.Bao61133388;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityLogin extends AppCompatActivity {

    EditText edtUserName,edtPass,edtMail;
    Button btOK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setControl();
        setEvent();
    }

    private void setEvent() {
        btOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Kiểm tra các input có trông hay không nếu có thì báo lỗi
                if(edtUserName.getText().toString().equals("")){
                    Toast.makeText(ActivityLogin.this,"Yêu cầu không được để trống UserName",Toast.LENGTH_SHORT);
                }else if(edtPass.getText().toString().equals("")){
                    Toast.makeText(ActivityLogin.this,"Yêu cầu không được để trống PassWork",Toast.LENGTH_SHORT);
                }else if(edtMail.getText().toString().equals("")){
                    Toast.makeText(ActivityLogin.this,"Yêu cầu không được để trống UserEmail",Toast.LENGTH_SHORT);
                }else {
                    //tạo Intent
                    Intent iQuiz = new Intent(ActivityLogin.this,ActivityHome.class);
                    //Tạo một giá trị gồm có Key và giá trị (key,value)
                    //khóa là tên và giá trị được lấy ở edt
                    iQuiz.putExtra("UserName",edtUserName.getText().toString());
                    //Thực hiện hành động chuyển màn hhình
                    startActivity(iQuiz);
                }
            }
        });
    }

    private void setControl() {
        edtUserName = findViewById(R.id.edtUserName);
        edtPass = findViewById(R.id.edtPass);
        edtMail = findViewById(R.id.edtMail);
        btOK = findViewById(R.id.btOK);
    }
}