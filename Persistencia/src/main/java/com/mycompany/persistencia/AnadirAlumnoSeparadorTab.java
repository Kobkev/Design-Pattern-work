/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.persistencia;

import java.nio.file.Files;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin Verelst
 */
public class AnadirAlumnoSeparadorTab implements UsoDatosAlumno {

    ListadoAlumnos la = new ListadoAlumnos();
    //PersistenciaMenu pm = new PersistenciaMenu();

    public void alumnoRegistro() {
        String nombre = JOptionPane.showInputDialog(null, "Cual es el nombre?: ", "Nombre", JOptionPane.QUESTION_MESSAGE);

        String matricula = JOptionPane.showInputDialog(null, "Cual es la matricula?: ", "Matricula", JOptionPane.QUESTION_MESSAGE);

        String notaFinal = JOptionPane.showInputDialog(null, "Cual es su nota final?: ", "Nota Final", JOptionPane.QUESTION_MESSAGE);
        //double m = Double.parseDouble(matricula);

        Alumno alumno = new Alumno(nombre, matricula, notaFinal);
        alumno.setNombre(nombre);
        alumno.setMatricula(matricula);
        alumno.setNotaFinal(notaFinal);

        String append = alumno.getNombre() + "\t" + alumno.getMatricula() + "\t" + alumno.getNotaFinal();

        la.ListadoAlumnos(append);

        //pm.add(alumno.getNombre());
    }

}
