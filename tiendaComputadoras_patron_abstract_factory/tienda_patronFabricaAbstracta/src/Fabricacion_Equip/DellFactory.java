/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricacion_Equip;

import componentes.Disco;
import componentes.MemoriaRam;
import componentes.OtrosComponentes;
import componentes.Procesador;
import interfaces.componentes_computadorasFactory;
import tipos_de_componentes.MemoriaRam_DDR3;
import tipos_de_componentes.OtrosComponentesv1;
import tipos_de_componentes.disco_STDO;
import tipos_de_componentes.disco_STDOv2;
import tipos_de_componentes.procesador_i5;
import tipos_de_componentes.procesador_i7;

/**
 * * @author Beatriz González
 */
public class DellFactory implements componentes_computadorasFactory{

    /*aqui es donde modificaremos la creacion de cada componente dependiendo de las especificaciones de como el usuario va armar su equipo
    //igual con sus restricciones que estan dadas estos pasaran como argumento en el constructor y a su vez se veran modifcados en sus metodos
    */
    //aqui es donde se da el encapsulamiento de los componentes de objeto padre que es el equipo y se da el desacoplamiento de ellos mismo
    @Override
    public Procesador crearProcesador(String option) {
       return option.equals("procesador i5") ? new procesador_i5(): new procesador_i7(); //aqui se vera modifcado por lo que el usuario elija
    }

    @Override
    public MemoriaRam crearMemoriaRAM() {
        return new MemoriaRam_DDR3(); //esto es estandar para cualquier equipo que desee armar
    }

    @Override
    public Disco crearDisco(String option) {
        return option.equals("256 GB") ? new disco_STDO(): new disco_STDOv2(); //aqui igual se vera modificado por el disco duro que elija
    }

    @Override
    public OtrosComponentes crearOtrosComponentes() {
        return new OtrosComponentesv1(); //esto es estandar para cualquier equipo que desee armar
    }
    
}
