/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresas_Equipos;

import Fabricacion_Equip.AppleFactory;
import clases.Computadora;
import clases.TiendaComputadoras;
import interfaces.componentes_computadorasFactory;

/**
 * * @author Beatriz González
 */
public class AppleTiendaComp extends TiendaComputadoras{

    @Override
    protected Computadora crearComputadora(String esp) {
         Computadora compu = null; 
         
         //implementamos componentes que van a tener todas las compuatdoras esto aplica para dell 
        componentes_computadorasFactory componente_compFact = new AppleFactory();
        
        if( esp.equals("256 GB")){
            
            compu = new compu_Apple(componente_compFact, esp); //entra componente y opcion
            compu.setNombre("computadora con procesador M1 y SSD 256 GB ");
        }
        if( esp.equals("512 GB")){
            
            compu = new compu_Apple(componente_compFact, esp); //entra componente y opcion
            compu.setNombre("computadora con procesador M1 y SSD 512 GB ");
        }
        
        return compu;
    }
    
}
