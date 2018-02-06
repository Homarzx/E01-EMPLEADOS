package com.cice.trabajador;

import com.cice.interfaz.IEmpleado;

public class Empleado implements IEmpleado{

    /*Declaramos los parametros que tendra la clase empleado y todas las clases siguientes*/

    String nombre;
    double salario;
    String nacimiento;
    double incremento = 1.0;

    /*NOTA:
    * Un empleado no tiene un incremento en su salario, por lo que no seria necesario declararlo
    * ni incluirlo en el constructor, sin embargo, lo he añadido por si en un futuro cambia esta función
    * (por ahora su valor no hara variar el precio)*/



    public Empleado(String nombre, double salario, String nacimiento) {
        this.nombre = nombre;
        this.salario = salario;
        this.nacimiento = nacimiento;
        aplicarIncremento();
    }

    public double getIncremento() {
        return incremento;
    }

    @Override
    public void aplicarIncremento() {
        salario = salario * getIncremento();
        /*Esete metodo, comun en todas las clases, calcula el incremento segun el valor pasado del metodo getIncremento*/

    }

    @Override
    public void identificarEmpleado() {
        System.out.println("[" + this.getClass().getSimpleName() + " : " + nombre + "]:[" + salario + "] Fecha de Nacimiento: " + nacimiento);
        /*Este metodo envia por consola toda la información guardada de la clase*/

    }
}
