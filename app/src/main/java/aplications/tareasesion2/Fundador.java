package aplications.tareasesion2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Fundador extends AppCompatActivity {

    Button btnSgte;
    Button btnAnte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fundador);
        this.setTitle("El Fundador");
        TextView algo = (TextView) findViewById(R.id.txtMensaje);
        algo.setText("En los años 50, un vendedor de Illinois llamado Ray Kroc conoció" +
                " a los hermanos Richard y Maurice McDonald que llevaban una hamburguesería al" +
                " sur de California. Impresionado por la velocidad del sistema de cocina de su" +
                " hamburguesería de San Bernardino, Kroc visualizó el potencial" +
                " de la franquicia y hábilmente se fue posicionando para arrebatárselo" +
                " a los hermanos y crear el hoy imperio de un billón de dólares." +
                " Así nació McDonald’s.");

        btnSgte = (Button) findViewById(R.id.btnSiguiente);

        btnSgte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent btnSgte = new Intent(Fundador.this, Multiple.class);
                startActivity(btnSgte);



            }
        });
        btnAnte = (Button) findViewById(R.id.btnAnterior);

        btnAnte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent btnAnte = new Intent(Fundador.this, MainActivity.class);
                startActivity(btnAnte);



            }
        });
    }
}
