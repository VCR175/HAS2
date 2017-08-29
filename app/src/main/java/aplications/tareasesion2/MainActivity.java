package aplications.tareasesion2;

import android.content.Intent;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnSgte;
    Button btnAnte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("Películas Geniales");
        TextView iniciot = (TextView) findViewById(R.id.txtMensaje);
        iniciot.setText("Un aplicativo de reseñas de películas");

        btnSgte = (Button) findViewById(R.id.btnSiguiente);

        btnSgte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent btnSgte = new Intent(MainActivity.this, Fundador.class);
                startActivity(btnSgte);

            }
        });
    }

    public void cerrar(View view) {
        this.finish();
    }


}
