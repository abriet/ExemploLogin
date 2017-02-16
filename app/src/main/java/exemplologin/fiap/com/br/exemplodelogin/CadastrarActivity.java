package exemplologin.fiap.com.br.exemplodelogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CadastrarActivity extends AppCompatActivity {

    EditText edtUser;
    EditText edtPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar);

        edtUser = (EditText) findViewById(R.id.edtNewUser);
        edtPass = (EditText) findViewById(R.id.edtNewPass);
    }

    public void cadastrarUsuario(View v){
        String user = edtUser.getText().toString();
        String pass = edtPass.getText().toString();

        
    }
}
