/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin Verelst
 */
public class StrategyPattern {

    public static void main(String[] args) {
        SeparadorLetra sle = new SeparadorLetra();
        SeparadorLinea sli = new SeparadorLinea();
        SeparadorPalabra sp = new SeparadorPalabra();

        Texto unTexto = new Texto();
        unTexto.colocarCadena("Bienvenido al curso de Patrones de Diseño");

        sle.separar(unTexto);
        sp.separar(unTexto);
        sli.separar(unTexto);
    }
}
