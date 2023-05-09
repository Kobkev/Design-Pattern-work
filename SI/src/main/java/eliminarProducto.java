/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevvvvvy
 */
public class eliminarProducto implements Operacion {
    operar(inventario i) {
        int j = inventario.indexOf(i);
        if (j >= 0) {
        inventario.remove(i);
    }
}
