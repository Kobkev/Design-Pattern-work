

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kevin Verelst
 */
public class Texto {

    private String cadena;
    Separador separador;

    public String obtenerCadena() {
        return cadena;
    }

    public void colocarCadena(String cadena) {
        this.cadena = cadena;
    }

    public void dividir(){
        String[] elementos;
        elementos = separador.separar(this);
    }
}
