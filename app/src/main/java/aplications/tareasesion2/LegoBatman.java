package aplications.tareasesion2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LegoBatman extends AppCompatActivity {

    Button btnSgte;
    Button btnAnte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lego_batman);
        this.setTitle("Lego Batman: La película");
        TextView algo = (TextView) findViewById(R.id.txtMensaje);
        algo.setText("Este spin-off se centra en el personaje de Batman " +
                "y en el universo de los superhéroes de DC Cómics, " +
                "desde la óptica de la conocida empresa de juguetes.");
        btnSgte = (Button) findViewById(R.id.btnSiguiente);

        btnSgte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent btnSgte = new Intent(LegoBatman.this, Moonlight.class);
                startActivity(btnSgte);



            }
        });
        btnAnte = (Button) findViewById(R.id.btnAnterior);

        btnAnte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent btnAnte = new Intent(LegoBatman.this, Sing.class);
                startActivity(btnAnte);



            }
        });
    }
}
