/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevvvvvy
 */
public class ReflexionApp {
    static String unTexto;
    static IEscribeTexto unEscribeTexto;
    
    public static void main(String[] args) {
        unTexto = System.getProperty("nombreClase");
        
        class<?> nombreClase = Class.forName(unTexto);
        
        Constructor<?> [] constructores = nombreClase.getConstructors();
        
        for (Constructor<?> unConstructor : constructores) {
            System.out.println("unConstructor");
        }
        
        unEscribeTexto = (IEscribeTexto) nombreClase.getConstructor().newInstance();
        
        unTexto = "Ejemplo de reflexión en Java";
        
        unEscribeTexto.escribir(unTexto);
    }
}
