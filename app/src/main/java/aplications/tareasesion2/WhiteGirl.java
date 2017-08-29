package aplications.tareasesion2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WhiteGirl extends AppCompatActivity {

    Button btnSgte;
    Button btnAnte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_white_girl);
        this.setTitle("White Girl");
        TextView algo = (TextView) findViewById(R.id.txtMensaje);
        algo.setText("Leah es una adolescente con cabellera platino y una sonrisa ganadora, " +
                "que busca el placer en todas sus formas. " +
                "A dos semanas de que acabe el semestre, " +
                "empieza a drogarse junto a su compañera de habitación y su jefe. " +
                "Pero además tiene tiempo de ligar con un atractivo camello puertorriqueño, " +
                "conocido como Blue.");

    btnSgte = (Button) findViewById(R.id.btnSiguiente);

        btnSgte.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent btnSgte = new Intent(WhiteGirl.this, MainActivity.class);
            startActivity(btnSgte);



        }
    });
    btnAnte = (Button) findViewById(R.id.btnAnterior);

        btnAnte.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent btnAnte = new Intent(WhiteGirl.this, MiVidaalosDiecisiete.class);
            startActivity(btnAnte);



        }
    });
}
}

