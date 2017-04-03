package com.example.usuario_16.fase3pmdm_empresa_ismael;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by usuario-16 on 3/04/17.
 */

public class Bd {
    public static List<Empleado>listEmpleado = new ArrayList<>();
    public static List<Jefe>listJefe = new ArrayList<>();

    public static List<Empleado> getListEmpleado() {
        return listEmpleado;
    }

    public static List<Jefe> getListJefe() {
        return listJefe;
    }
    public void addEmpleado(String dni,String nombre,String apellidos,String puesto, String funcion){
        Empleado empleado = new Empleado(dni,nombre,apellidos,puesto,funcion);
        listEmpleado.add(empleado);
    }
    public void addJefe(String dni,String nombre,String apellidos,String empleados){
        Jefe jefe = new Jefe(dni,nombre,apellidos,empleados);
        listJefe.add(jefe);

    }
}
