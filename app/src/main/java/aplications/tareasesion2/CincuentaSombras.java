package aplications.tareasesion2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class CincuentaSombras extends AppCompatActivity {

    Button btnSgte;
    Button btnAnte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cincuenta_sombras);
        this.setTitle("Cincuenta sombras más oscuras");
        TextView algo = (TextView) findViewById(R.id.txtMensaje);
        algo.setText("Segunda entrega de la trilogía que describe la relación entre " +
                "la recién graduada universitaria Anastasia Steele (Dakota Johnson)" +
                " y el joven magnate de los negocios Christian Grey (Jamie Dornan)," +
                " y que continúa justo después del desenlace de la primera, " +
                "cuando Anastasia se encuentra abrumada y desolada ante el poder que ejerce sobre " +
                "ella el misterioso Christian. ");
        btnSgte = (Button) findViewById(R.id.btnSiguiente);

        btnSgte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent btnSgte = new Intent(CincuentaSombras.this, Sing.class);
                startActivity(btnSgte);



            }
        });
        btnAnte = (Button) findViewById(R.id.btnAnterior);

        btnAnte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent btnAnte = new Intent(CincuentaSombras.this, Multiple.class);
                startActivity(btnAnte);



            }
        });
    }
}
