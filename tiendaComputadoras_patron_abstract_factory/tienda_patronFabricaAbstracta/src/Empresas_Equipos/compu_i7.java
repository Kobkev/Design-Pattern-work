/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresas_Equipos;

import clases.Computadora;
import interfaces.componentes_computadorasFactory;

/**
 * * @author Beatriz González
 */
public class compu_i7 extends Computadora{
    
    componentes_computadorasFactory computadoraFactory;
    String option;
    
     public compu_i7(componentes_computadorasFactory computadoraFactory, String option) {
        this.computadoraFactory = computadoraFactory;
        this.option = option;
    }

    @Override
    public void fabricacion() {
        System.out.println("Fabricando " + nombre);
        procesador = computadoraFactory.crearProcesador("procesador i7");
        memoriaram = computadoraFactory.crearMemoriaRAM();
        disco = computadoraFactory.crearDisco(option); //se deja por default porque asi esta establecido no tiene mas opciones para este equipo
        otroscomponentes = computadoraFactory.crearOtrosComponentes();
    }
    
}
