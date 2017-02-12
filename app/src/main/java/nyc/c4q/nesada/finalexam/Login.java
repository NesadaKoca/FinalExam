package nyc.c4q.nesada.finalexam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by NesadaKoca on 2/12/2017.
 */

public class Login extends AppCompatActivity {

    private EditText mEtUsername, mEtPassword;
    private Button mBtnLogin;
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mEtUsername = (EditText) findViewById(R.id.username);
        mEtPassword = (EditText) findViewById(R.id.password);
        mBtnLogin = (Button) findViewById(R.id.btn_login);

        mToolbar = (Toolbar) findViewById(R.id.toobar);
        setSupportActionBar(mToolbar);
        setTitle("Login");

        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = mEtUsername.getText().toString();
                String password = mEtPassword.getText().toString();

                if (userName.equals("")) {
                    Toast.makeText(view.getContext(), "Enter a username", Toast.LENGTH_SHORT).show();
                } else if (password.equals("")) {
                    Toast.makeText(view.getContext(), "Enter a password", Toast.LENGTH_SHORT).show();
                } else {
                    Intent profile = new Intent(view.getContext(), Profile.class);
                    view.getContext().startActivity(profile);
                }
            }
        });

    }
}
