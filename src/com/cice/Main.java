package com.cice;

/*En una aplicación creada para una empresa, se quieren guardar los datos de los empleados:
nombre, salario, fecha de Nacimiento.
Los gerentes son empleados que además se hacen cargo de un departamento de la empresa.
Su método “incentivo” multiplica el salario por 1.05
Cuando un gerente llega a director se le asigna un coche de empresa.
La aplicación guarda la matrícula de ese coche.
Su método “incentivo” multiplica el salario por 1.10 y le incrementa
100
Comprobar que las clases creadas funcionan y revisar si el método de incentivación funciona.
Para verlo, crea un array de 5 empleados: 3 empleados normales, 1 gerente, 1 director.*/

import com.cice.interfaz.ECocheEmpresa;
import com.cice.interfaz.EDepartamento;
import com.cice.interfaz.IEmpleado;
import com.cice.trabajador.Director;
import com.cice.trabajador.Empleado;
import com.cice.trabajador.Gerente;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /*ORDEN DE PRODUCCIÓN
        * 1) Interfaz IEmpleado -> Metodos de descripción y aplicar incremento
        * 2) Clase Empleado -> Parametros, Constructor y metodos
        * 3) Clase Enum EDepartamento -> Departamentos añadido como elementos
        * 4) Clase Gerente -> Herencia de la clase Empleado + nuevo incremento y declarado como parametro EDepartamento dentro del constructor -> Departamento
        * 5) Clase Enum ECocheEmpresa -> Coches añadido como elementos
        * 6) Clase Director -> Herencia de la clase Gerento + nuevo incremento y declarado como parametro ECocheEmpresa dentro del constructor -> CocheEmpresa
        * 7) Main -> Creada lista y bucle con las 3 clases anteriores (Empleado/Gerente/Jefe)*/

        List <IEmpleado> listaEmpleados = new ArrayList();
        /*Creamos una nueva lista de la interfaz IEmpleado como dato con los metodos de una ArrayList*/
        listaEmpleados.add(new Empleado("Jose Miguel", 300, "7 de Noviembre de 1998"));
        /*Añadimos un nuevo objeto a la lista inicializando los parametros pasados por el constructor de su clase*/
        listaEmpleados.add(new Empleado("Joser Ernesto Díaz", 250, "23 de Noviembre de 1993"));
        listaEmpleados.add(new Empleado("Maria Antonieta", 500, "19 de Julio 1993"));
        listaEmpleados.add(new Empleado("Josemi Pelosa", 250, "Mañana"));
        listaEmpleados.add(new Gerente("Señor Pelosa",500,"8 Julio de 1899", EDepartamento.RECURSOS));
        /*En el caso del objeto Gerente y Director ademas tenemos que especificar que elemento queremos añadir de las clases Enum*/
        listaEmpleados.add(new Director("Jose Money", 1000, "19 Julio de 1978", EDepartamento.FINANZAS, ECocheEmpresa.SEATateca));

        Iterator it = listaEmpleados.iterator();
        /*Usamos un iterator que nos sirva para leer la lista*/

        int i = 0;

        while (listaEmpleados.size() > i) {
            /*Bucle para recorrer la lista*/
            IEmpleado empleado = (IEmpleado)it.next();
            /*Por el iterator anterior podemos recorrer los siguientes elementos*/
            empleado.identificarEmpleado();
            /*De los elementos de la lista ejecutamos el metodo comun a todos los objetos añadidos (Empleado/Gerente/Director)*/
            i++;
            /*Un cambio de valor para hacer bucle finito, LOCO! NO LO QUITES O ENTRAMOS EN BUCLE CHUNGO!*/
        }


    }
}
