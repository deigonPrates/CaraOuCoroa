package activivity.estudo.caraoucoroa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageButton jogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jogar = (ImageButton) findViewById(R.id.btnJogar);

        jogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random  aleatorio = new Random();
                int moeda = aleatorio.nextInt(2);

                Intent intent = new Intent(MainActivity.this, Resultado.class);
                Bundle bundle = new Bundle();

                bundle.putInt("lado", moeda);
                intent.putExtras(bundle);

                startActivity(intent);

            }
        });
    }
}
