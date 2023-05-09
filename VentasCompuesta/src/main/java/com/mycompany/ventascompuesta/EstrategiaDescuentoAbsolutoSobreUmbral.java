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
public class EstrategiaDescuentoAbsolutoSobreUmbral implements IEstrategiaPreciosVenta {

    float descuento = 10000f;
    float umbral = 400f;
   
    
    
    public float obtenerTotal(float total) {
        float ventaAntes;
        ventaAntes = total;
        if (ventaAntes < umbral) {
            return (ventaAntes);
        } else {
            return (ventaAntes - descuento);
        }
    }
}
