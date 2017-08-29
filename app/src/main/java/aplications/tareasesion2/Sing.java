package aplications.tareasesion2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Sing extends AppCompatActivity {

    Button btnSgte;
    Button btnAnte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing);
        this.setTitle("Ven y Canta");
        TextView algo = (TextView) findViewById(R.id.txtMensaje);
        algo.setText("McConaughey pondrá voz a un koala dueño de un gran teatro que está pasando por" +
                " un momento muy delicado y que, con el fin de recuperar la gloria perdida, organiza " +
                "el concurso de canto más grande del mundo. ");
        btnSgte = (Button) findViewById(R.id.btnSiguiente);

        btnSgte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent btnSgte = new Intent(Sing.this, LegoBatman.class);
                startActivity(btnSgte);



            }
        });
        btnAnte = (Button) findViewById(R.id.btnAnterior);

        btnAnte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent btnAnte = new Intent(Sing.this, CincuentaSombras.class);
                startActivity(btnAnte);



            }
        });
    }
}
