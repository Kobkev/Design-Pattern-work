/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import componentes.*;

/**
 * * @author Beatriz González
 */
public abstract class Computadora {
    public String nombre;
    
    //todo equipo cuenta con todos estos componentes
    public Procesador procesador;
    public MemoriaRam memoriaram;
    public Disco disco;
    public OtrosComponentes otroscomponentes;
    
    public abstract void fabricacion();
    
    public void pruebas(){
        System.out.println("haciendo pruebas tardaremos 30 minutos");
    }
    
    public void empacarM(){ //empacar marca
        System.out.println("poniendo el equipo en su caja respectiva de la marca");
    }
    
    public void empacarT(){ //empacar tienda
        System.out.println("poniendo el equipo en una caja oficial de la tienda");
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("---- " + nombre + " ----\n");
		if (procesador != null) {
			result.append(procesador);
			result.append("\n");
		}
		if (memoriaram != null) {
			result.append(memoriaram);
			result.append("\n");
		}
		if (disco != null) {
			result.append(disco);
			result.append("\n");
		}
		
		if (otroscomponentes != null) {
			result.append(otroscomponentes);
			result.append("\n");
		}
		return result.toString();
	}
}
