package activivity.estudo.caraoucoroa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class Resultado extends AppCompatActivity {

    private ImageView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        resultado = (ImageView) findViewById(R.id.imageView2);

        Intent intent =  getIntent();

        Bundle bundle = intent.getExtras();

        int lado = bundle.getInt("lado");

        if(lado == 1){
            resultado.setImageResource(R.drawable.moeda_cara);
        }else{
            resultado.setImageResource(R.drawable.moeda_coroa);
        }
    }
}
