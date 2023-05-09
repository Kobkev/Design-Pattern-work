/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.persistencia;

import java.util.LinkedList;

/**
 *
 * @author Kevin Verelst
 */
public class ListadoAlumnos {

    LinkedList<String> listadoAlumnos = new LinkedList<>();
    

    public void ListadoAlumnos(String append) {
        listadoAlumnos.add(append);
        
        for (Object s : listadoAlumnos) {
            System.out.println(s);
        }

    }

    public void Mostrar() { /////////////////////////////////// NO COMPRENDO POR QUE NO FUNCIONA
        for (Object s : listadoAlumnos) {
            System.out.println(s);
        }
    }
}
