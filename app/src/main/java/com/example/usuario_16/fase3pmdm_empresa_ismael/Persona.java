package com.example.usuario_16.fase3pmdm_empresa_ismael;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by usuario-16 on 3/04/17.
 */

public class Persona {
    private String dni;
    private String nombre;
    private String apellidos;

    public Persona(){}
    public Persona(String dni, String nombre, String apellidos) {
        this.dni=dni;
        this.nombre=nombre;
        this.apellidos=apellidos;
    }

    private void saludar(String nombre){
        this.nombre=nombre;
        Log.d("Hola:", nombre);
    }


}
