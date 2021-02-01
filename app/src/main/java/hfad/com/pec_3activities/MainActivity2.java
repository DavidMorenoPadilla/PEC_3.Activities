package hfad.com.pec_3activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView tvNombre,tvTel,tvEmail,tvNacimiento,tvContacto;
    Button bedit;
    String nombre,tel,email,desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        recibirDatos();

        nombre=tvNombre.getText().toString();
        tel=tvTel.getText().toString();
        email=tvEmail.getText().toString();
        desc=tvContacto.getText().toString();

        bedit=(Button)findViewById(R.id.beditar);
        bedit.setOnClickListener(new View.OnClickListener() {
            
            @Override
            public void onClick(View v) {
                // Cierra la ventana y vuelve a la anterior tal y como estaba
                finish();
            }
        });

    }

    private void recibirDatos() {

        // Capturamos los extras
        Bundle extras = getIntent().getExtras();
        String nombre = extras.getString("nombre");
        String telefono = extras.getString("telefono");
        String contacto = extras.getString("contacto");
        String email = extras.getString("email");
        String nacimiento = extras.getString("nacimiento");

        // Capturamos los elementos
        tvNombre=(TextView)findViewById(R.id.tvnombre);
        tvTel=(TextView)findViewById(R.id.tvtelef);
        tvEmail=(TextView)findViewById(R.id.tvemail);
        tvNacimiento=(TextView)findViewById(R.id.tvfecha);
        tvContacto=(TextView)findViewById(R.id.tvdescripcion);

        // Rellenamos los datos
        tvNombre.setText(nombre);
        tvTel.setText(telefono);
        tvEmail.setText(email);
        tvContacto.setText(contacto);
        tvNacimiento.setText(nacimiento);

    }
}