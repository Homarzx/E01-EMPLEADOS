package com.cice.interfaz;

public enum ECocheEmpresa {

    /*Se añaden los elementos que estaran disponibles a partir de la clase Director*/

    SEATleon("4445JPG"),
    VOLSWAGENgolf("2001WTF"),
    SEATateca("1881HDP"),
    AUDIq3("6969FCK");

    /*Entre parentesis se pasa como parametro el dato que guardara que en este caso
    * sera de tipo String haciendo referencia a la matricula del vehiculo*/

    String matricula;

    ECocheEmpresa(String matricula) {
        this.matricula = matricula;
        /*Constructor donde le tenemos que pasar como parametro el tipo de dato de los
        * elementos de la colección*/
    }



}
