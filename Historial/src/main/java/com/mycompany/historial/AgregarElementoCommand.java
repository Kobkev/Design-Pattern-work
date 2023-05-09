package com.mycompany.historial;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kevin Verelst
 */
public class AgregarElementoCommand implements Command {

    Elemento elemento;

    public AgregarElementoCommand(Elemento elemento) {
        this.elemento = elemento;
    }

    public void execute() {
        elemento.Agregar();
    }

    public void unexecute() {
        elemento.elemento.removeLast();
        elemento.Update();
    }

    public void redo() {
           
    }

}
