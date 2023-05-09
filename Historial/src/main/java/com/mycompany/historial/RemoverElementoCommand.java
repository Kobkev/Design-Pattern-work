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
public class RemoverElementoCommand implements Command {

    Elemento elemento;

    String anterior;

    public RemoverElementoCommand(Elemento elemento) {
        this.elemento = elemento;
    }

    public void execute() {
        anterior = elemento.getEle();
        elemento.Remover();
    }

    public void unexecute() {
        elemento.elemento.add(anterior);
        elemento.Update();
    }
    
    public void redo() {
        
    }

}
