package hfad.com.pec_3activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    DatePicker datePicker;
    EditText etNombre,etTelefono,etEmail,etDesc;
    Button bSiguiente;
    int dia,mes,ano;
    String fecha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datePicker=(DatePicker)findViewById(R.id.datePicker);
        etNombre=(EditText)findViewById(R.id.etnombre);
        etTelefono=(EditText)findViewById(R.id.ettelefono);
        etEmail=(EditText)findViewById(R.id.etemail);
        etDesc=(EditText)findViewById(R.id.etdescripcion);

        dia = datePicker.getDayOfMonth();
        mes = datePicker.getMonth();
        ano = datePicker.getYear();

        fecha=dia+"/"+mes+"/"+ano;

        bSiguiente = (Button)findViewById(R.id.bsiguiente);
        bSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("nombre",etNombre.getText().toString());
                intent.putExtra("telefono",etTelefono.getText().toString());
                intent.putExtra("email",etEmail.getText().toString());
                intent.putExtra("contacto",etDesc.getText().toString());
                intent.putExtra("nacimiento",fecha);
                startActivity(intent);

            }
        });

    }

}