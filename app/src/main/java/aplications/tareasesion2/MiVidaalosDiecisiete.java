package aplications.tareasesion2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MiVidaalosDiecisiete extends AppCompatActivity {

    Button btnSgte;
    Button btnAnte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_vidaalos_diecisiete);
        this.setTitle("Mi vida a los 17");
        TextView algo = (TextView) findViewById(R.id.txtMensaje);
        algo.setText("Se centra en Nadine (Hailee Steinfeld) y Krista (Haley Lu Richardson), " +
                "dos inseparables mejores amigas que intentan pasar la secundaria juntas. " +
                "Pero la amistad encuentra problemas cuando Nadine descubre que su " +
                "hermano mayor y Krista han estado saliendo a sus espaldas. " +
                "Pronto se dan cuenta que hay una fina línea entre mejores amigas y peores enemigas.");
        btnSgte = (Button) findViewById(R.id.btnSiguiente);

        btnSgte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent btnSgte = new Intent(MiVidaalosDiecisiete.this, WhiteGirl.class);
                startActivity(btnSgte);



            }
        });
        btnAnte = (Button) findViewById(R.id.btnAnterior);

        btnAnte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent btnAnte = new Intent(MiVidaalosDiecisiete.this, UnCaminoaCasa.class);
                startActivity(btnAnte);



            }
        });
    }
}

