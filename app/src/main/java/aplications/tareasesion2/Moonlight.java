package aplications.tareasesion2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Moonlight extends AppCompatActivity {


    Button btnSgte;
    Button btnAnte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moonlight);
        this.setTitle("Luz de luna");
        TextView algo = (TextView) findViewById(R.id.txtMensaje);
        algo.setText("Moonlight cuenta la difícil infancia, adolescencia y madurez " +
                "de un chico afroamericano que crece en una zona conflictiva de Miami." +
                " A medida que pasan los años, el joven se descubre a sí mismo y encuentra el amor " +
                "en lugares inesperados. Al mismo tiempo, tiene que hacer frente a la " +
                "incomprensión de su familia y a la violencia de los chicos del barrio.");
        btnSgte = (Button) findViewById(R.id.btnSiguiente);

        btnSgte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent btnSgte = new Intent(Moonlight.this, UnCaminoaCasa.class);
                startActivity(btnSgte);



            }
        });
        btnAnte = (Button) findViewById(R.id.btnAnterior);

        btnAnte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent btnAnte = new Intent(Moonlight.this, LegoBatman.class);
                startActivity(btnAnte);



            }
        });
    }
}