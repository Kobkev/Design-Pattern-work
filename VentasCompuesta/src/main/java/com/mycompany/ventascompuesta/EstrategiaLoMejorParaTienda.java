package com.mycompany.ventascompuesta;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static java.lang.Float.MIN_VALUE;
import static java.lang.Float.max;

/**
 *
 * @author Kevin Verelst
 */
public class EstrategiaLoMejorParaTienda extends EstrategiaCompuesta {
    
    public float obtenerTotal(float totala) {
        float maxTotal = 5000;
        for (IEstrategiaPreciosVenta est : estrategias) {
            float total = totala;
            maxTotal = max(total, maxTotal);
        }
        return (maxTotal);
    }
}
