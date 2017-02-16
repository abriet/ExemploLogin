package exemplologin.fiap.com.br.exemplodelogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {


    EditText edtNome;
    EditText edtSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtNome = (EditText) findViewById(R.id.edtUsuario);
        edtSenha = (EditText) findViewById(R.id.edtSenha);
    }

    public void logar(View v){
        String user = edtNome.getText().toString();
        String senha = edtSenha.getText().toString();

        if(user.trim().isEmpty() || senha.trim().isEmpty()){
            Toast.makeText(this, getString(R.string.login_campo_vazio), Toast.LENGTH_SHORT).show();
        }else if(user.equals("FIAP") && senha.equals("FIAP123")){
            Intent t = new Intent(this, MainActivity.class);
            startActivity(t);
        }else{
            Toast.makeText(this, getString(R.string.login_erro), Toast.LENGTH_SHORT).show();
        }
    }

    public void cadastrar(View v){
        Intent t = new Intent(this, CadastrarActivity.class);
        startActivity(t);
    }
}
