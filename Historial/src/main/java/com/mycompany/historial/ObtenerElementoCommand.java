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
public class ObtenerElementoCommand implements Command {

    Elemento elemento;

    public ObtenerElementoCommand(Elemento elemento) {
        this.elemento = elemento;
    }

    public void execute() {
        elemento.Obtener();
    }

    public void unexecute() {

    }

    public void redo() {

    }

}
