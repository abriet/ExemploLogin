package exemplologin.fiap.com.br.exemplodelogin;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class GeradorActivity extends AppCompatActivity {

    ImageView iView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gerador);
        iView = (ImageView) findViewById(R.id.imgView);
    }
    public void Sorteador(View v){
        Random rand = new Random();
        String nomeImagem = "@drawable/imagem_" + rand.nextInt(5);
        iView.setImageResource(getResources().getIdentifier(nomeImagem, null, getPackageName()));
        Toast.makeText(this, nomeImagem.replace("@drawable/","Sua imagem agora é: "), Toast.LENGTH_SHORT).show();
    }
}
