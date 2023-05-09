/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin Verelst
 */
public class SeparadorLinea {

    public String[] separar(Texto unTexto) {
        String cadena = unTexto.obtenerCadena();

        String[] ncadena = cadena.split(" ");

        for (int i = 0; i < ncadena.length; i++) {
            System.out.println(ncadena[i]);
        }

        System.out.println("");
        /*for (String car : ncadena) {
            System.out.println(car); ESTO LO UTILICE CON METODO DE TIPO VOID
        }
        System.out.println("");*/
        return ncadena;
    }
}
