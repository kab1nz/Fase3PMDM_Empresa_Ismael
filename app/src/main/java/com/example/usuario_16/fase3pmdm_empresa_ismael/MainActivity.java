package com.example.usuario_16.fase3pmdm_empresa_ismael;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnInsertar,btnVerTrabajadores,btnVerJefes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnInsertar= (Button)findViewById(R.id.btn_verInserEmpleado);
        btnInsertar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,InsertaEmpleados.class);
                startActivity(intent);

            }
        });

    }
}
