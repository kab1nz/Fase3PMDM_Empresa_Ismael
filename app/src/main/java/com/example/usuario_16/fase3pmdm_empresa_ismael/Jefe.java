package com.example.usuario_16.fase3pmdm_empresa_ismael;

import java.util.ArrayList;

/**
 * Created by usuario-16 on 3/04/17.
 */

public class Jefe extends Persona {
    private String departamento;
    private ArrayList<Empleado>listaEmpleado = new ArrayList<>();

    public Jefe(){
        super();

    }
    public Jefe(String dni,String nombre,String apellidos,String departamento) {
        super(dni,nombre,apellidos);
        this.departamento=departamento;


    }

    public ArrayList<Empleado> getListaEmpleado() {
        return listaEmpleado;
    }

    public void setListaEmpleado(ArrayList<Empleado> listaEmpleado) {
        this.listaEmpleado = listaEmpleado;
    }
    public void addEmpledao(String dni,String nombre,String apellidos,String puesto, String funcion){
        Empleado empleado = new Empleado(nombre,apellidos,puesto,funcion,dni);
        listaEmpleado.add(empleado);

    }
}
