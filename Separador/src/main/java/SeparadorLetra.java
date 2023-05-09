/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin Verelst
 */
public class SeparadorLetra implements Separador {

    public String[] separar(Texto unTexto) {
        String cadena = unTexto.obtenerCadena();

        String[] ncadena = cadena.split("");

        for (int i = 0; i < ncadena.length; i++) {
            System.out.print(ncadena[i] + " ");
        }
        System.out.println("");
        /*for (String car : ncadena) {
            System.out.print(car + " ");  ESTO LO UTILICE CON METODO DE TIPO VOID
        }
        System.out.println("");
         */

        return ncadena;
    }
}
