package com.example.usuario_16.fase3pmdm_empresa_ismael;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InsertaEmpleados extends AppCompatActivity {
    EditText etnombre,etapellidos,etdni,etfuncion,etpuesto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inserta_empleados);
        final Button btninsertar;
        etnombre= (EditText)findViewById(R.id.et_nombre);
        etapellidos= (EditText)findViewById(R.id.et_ape);
        etdni= (EditText)findViewById(R.id.et_dni);
        etfuncion= (EditText)findViewById(R.id.et_funcion);
        etpuesto= (EditText)findViewById(R.id.et_puesto);
        btninsertar=(Button)findViewById(R.id.btn_insertar);
        btninsertar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre,apellidos,dni,funcion,puesto;
                nombre=etnombre.getText().toString().toLowerCase().trim();
                apellidos=etapellidos.getText().toString().toLowerCase().trim();
                dni=etdni.getText().toString().toLowerCase().trim();
                funcion=etfuncion.getText().toString().toLowerCase().trim();
                puesto=etpuesto.getText().toString().toLowerCase().trim();
                if(nombre.equals("")||apellidos.equals("")||dni.equals("")||funcion.equals("")||puesto.equals("")){
                    Toast.makeText(getApplicationContext(),"¡¡Campo Vacios!!",Toast.LENGTH_LONG).show();
                    btninsertar.setEnabled(false);
                    etnombre.setText("");
                    etapellidos.setText("");
                    etfuncion.setText("");
                    etpuesto.setText("");
                    etdni.setText("");
                }else{
                   btninsertar.setEnabled(true);
                    Empleado empl = new Empleado(dni,nombre,apellidos,puesto,funcion);
                    Bd.listEmpleado.add(empl);
                    etnombre.setText("");
                    etapellidos.setText("");
                    etfuncion.setText("");
                    etpuesto.setText("");
                    etdni.setText("");
                    Toast.makeText(getApplicationContext(),"¡¡Datos insertados correctamente!!",Toast.LENGTH_LONG).show();

                }

            }
        });

    }
}
