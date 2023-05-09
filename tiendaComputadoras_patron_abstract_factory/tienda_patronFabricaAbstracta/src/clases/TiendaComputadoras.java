/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 * * @author Beatriz González
 */
public abstract class TiendaComputadoras {

    protected abstract Computadora crearComputadora(String esp); //aqui crearemos la computadora con las configuraciones que nos den y el tipo

    public Computadora ordenarComputadora(String tipo) {
        
        Computadora compu = crearComputadora(tipo);
        
        System.out.println("fabricando" + compu.getNombre() + " ---");
        //aqui es donde hacemos la separacion de lo que se mantiene igual a lo que cambia que es donde separamos esa parte para encapsularlo
        //y nos quitemos la parte de new en cada instancia. al igual de que aplicamos un principio de que las dependencias abstractas dependan de las
        //clases concretas y no al reves esto se le llama depedencia inversa
        compu.fabricacion();
        compu.pruebas();
        compu.empacarM();
        compu.empacarT();
        return compu;
         
    }
}
