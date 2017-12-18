package activivity.estudo.caraoucoroa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Resultado extends AppCompatActivity {

    private ImageView resultado;
    private ImageButton voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        resultado = (ImageView) findViewById(R.id.imageView2);
        voltar = (ImageButton) findViewById(R.id.btnVoltar);


        Intent intent =  getIntent();

        Bundle bundle = intent.getExtras();

        int lado = bundle.getInt("lado");

        if(lado == 1){
            resultado.setImageResource(R.drawable.moeda_cara);
        }else{
            resultado.setImageResource(R.drawable.moeda_coroa);
        }

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent voltando = new Intent(Resultado.this, MainActivity.class);
                startActivity(voltando);
            }
        });
    }
}
