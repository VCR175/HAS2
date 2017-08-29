package aplications.tareasesion2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class UnCaminoaCasa extends AppCompatActivity {

    Button btnSgte;
    Button btnAnte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_un_caminoa_casa);
        this.setTitle("Un camino a casa");
        TextView algo = (TextView) findViewById(R.id.txtMensaje);
        algo.setText("Saroo (Dev Patel) es un muchacho indio que vive en la extrema " +
                "pobreza con su madre y su hermano en la ciudad de Calcuta." +
                " Con tan solo 5 años, se separa accidentalmente de su familia en " +
                "una estación de tren y se pierde a miles de kilómetros de su casa.");
        btnSgte = (Button) findViewById(R.id.btnSiguiente);

        btnSgte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent btnSgte = new Intent(UnCaminoaCasa.this, MiVidaalosDiecisiete.class);
                startActivity(btnSgte);



            }
        });
        btnAnte = (Button) findViewById(R.id.btnAnterior);

        btnAnte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent btnAnte = new Intent(UnCaminoaCasa.this, Moonlight.class);
                startActivity(btnAnte);



            }
        });
    }
}
