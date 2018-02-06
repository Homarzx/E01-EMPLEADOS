package com.cice.trabajador;
import com.cice.interfaz.EDepartamento;
import com.cice.interfaz.ECocheEmpresa;

public class Director extends Gerente {

    ECocheEmpresa cocheEmpresa;

    public Director(String nombre, double salario, String nacimiento, EDepartamento departamento, ECocheEmpresa cocheEmpresa) {
        super(nombre, salario, nacimiento, departamento);
        this.cocheEmpresa = cocheEmpresa;
        /*Añadimos en el constructor de Director los elementos de la clase Gerente (que hereda de la clase padre) + Coches de Empresa de la clase Enum ECocheEmpresa*/
    }

    @Override
    public double getIncremento() {
        return incremento = 1.10;
    }

    @Override
    public void identificarEmpleado() {
        System.out.println("[" + departamento + "]:[" + this.getClass().getSimpleName() + " : " + nombre + "]:[" + salario + "] Fecha de Nacimiento: " + nacimiento + " su coche de empresa es un: " + cocheEmpresa);
        //super.identificarEmpleado();
    }
}
