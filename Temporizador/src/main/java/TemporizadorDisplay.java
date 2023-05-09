/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin Verelst
 */
public class TemporizadorDisplay implements Observer, DisplayElement {

    private int hora;
    private int min;
    private int seg;
    private Subject temporizadorData;

    public TemporizadorDisplay(Subject temporizadorData) {
        this.temporizadorData = temporizadorData;
        temporizadorData.registerObserver(this);
    }

    public void update(int hora, int min, int seg) {
        this.hora = hora;
        this.min = min;
        this.seg = seg;
        display();
    }

    public void display() {
        System.out.println(hora + " : " + min + " : " + seg);
        System.out.println("Se recibio una notificacion!!");
    }
}
