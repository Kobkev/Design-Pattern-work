/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresas_Equipos;

import Fabricacion_Equip.DellFactory;
import clases.Computadora;
import clases.TiendaComputadoras;
import interfaces.componentes_computadorasFactory;

/**
 * * @author Beatriz González
 */
public class DellTiendaComp extends TiendaComputadoras{

    @Override
    protected Computadora crearComputadora(String esp) {
        Computadora compu = null; 
        //implementamos componentes que van a tener todas las compuatdoras esto aplica para dell 
        componentes_computadorasFactory componente_compFact = new DellFactory();
        
        if( esp.equals("procesador i5")){
            
            compu = new compu_i5(componente_compFact, esp); //entra componente y opcion
            compu.setNombre("computadora con procesador i5 ");
        }
        //la opcion 1 es para i7 con disco duro de 512 GB y la dos para 256 GB esto con las restricciones que tenemos
        else if( esp.equals("procesador i7")){
            compu = new compu_i7(componente_compFact, "256 GB");
            compu.setNombre("computadora con procesador i7 y disco duro de 256 GB ");
        }
        else{
            compu = new compu_i7(componente_compFact, "512 GB");
            compu.setNombre("computadora con procesador i7 y disco duro de 512 GB");
        }
        
        return compu;
    }
    
}
