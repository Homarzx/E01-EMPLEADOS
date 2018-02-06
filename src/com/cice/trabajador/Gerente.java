package com.cice.trabajador;
import com.cice.interfaz.EDepartamento;
/*Importamos la clase Enum EDepartemento*/

public class Gerente extends Empleado {

    EDepartamento departamento;

    public Gerente(String nombre, double salario, String nacimiento, EDepartamento departamento) {
        super(nombre, salario, nacimiento);
        this.departamento = departamento;
        /*Añadimos en el constructor de Gerente los elementos de la clase padre + Departamentos de la clase Enum EDepartamento*/


        /*NOTA:
        * Si volvemos a poner el metodo aplicarIncremento() se aplicara el incremento dos veces, pues ya viene incluido
        * en el constructor del padre*/
    }

    @Override
    public double getIncremento() {
        return incremento = 1.05;
        /*Este metodo es el que nos permite cambiar el valor del incremento a aplicar en el salario*/
    }

    @Override
    public void identificarEmpleado() {
        System.out.println("[" + departamento + "]:[" + this.getClass().getSimpleName() + " : " + nombre + "]:[" + salario + "] Fecha de Nacimiento: " + nacimiento);
        /*Como super.identificarEmpleado() pero añadiendo elementos nuevos como Departamento*/
    }
}
