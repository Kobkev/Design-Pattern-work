package com.mycompany.ventascompuesta;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin Verelst
 */
public class EstrategiaPorcentajeDescuento implements IEstrategiaPreciosVenta {

    float porcentaje = 0.50f;
    
    
    public float obtenerTotal(float total) {
        float nuevo = (total * porcentaje);
        return (total - nuevo);
    }
}
