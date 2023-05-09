/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import componentes.*;//importamos todos los compoentes

/**
 * * @author Beatriz González
 */
public interface componentes_computadorasFactory {
    //a esta parte se le da el nombre de fabrica abstracta esto debido a que todos los componentes se va a ir creando dependiendo del equipo
    //en especifico al igual de que todo esto son interfaces
    public Procesador crearProcesador(String option);
    public MemoriaRam crearMemoriaRAM();
    public Disco crearDisco(String option);
    public OtrosComponentes crearOtrosComponentes();
}
