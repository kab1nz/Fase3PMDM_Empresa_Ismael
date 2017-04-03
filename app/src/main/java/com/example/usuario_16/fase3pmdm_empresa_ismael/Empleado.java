package com.example.usuario_16.fase3pmdm_empresa_ismael;

/**
 * Created by usuario-16 on 3/04/17.
 */

public class Empleado extends Persona{
    private String puesto;
    private String funcion;

    public Empleado(){
        super();

    }
    public Empleado(String dni,String nombre,String apellidos,String puesto, String funcion) {
        super(dni,nombre,apellidos);
        this.puesto = puesto;
        this.funcion = funcion;

    }

}
