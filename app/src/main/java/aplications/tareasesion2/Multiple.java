package aplications.tareasesion2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Multiple extends AppCompatActivity {

    Button btnSgte;
    Button btnAnte;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple);
        this.setTitle("Multiple");
        TextView algo = (TextView) findViewById(R.id.txtMensaje);
        algo.setText("Multiple (split) : Debido a un trauma de la infancia temprana, " +
                "Kevin (James McAvoy) sufre trastorno de identidad disociativo (DID)," +
                " más comúnmente conocido como trastorno de personalidad múltiple. " +
                "Dentro de él conviven 23 identidades diferentes.");

        btnSgte = (Button) findViewById(R.id.btnSiguiente);

        btnSgte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent btnSgte = new Intent(Multiple.this, CincuentaSombras.class);
                startActivity(btnSgte);



            }
        });
        btnAnte = (Button) findViewById(R.id.btnAnterior);

        btnAnte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent btnAnte = new Intent(Multiple.this, Fundador.class);
                startActivity(btnAnte);



            }
        });
    }
}
