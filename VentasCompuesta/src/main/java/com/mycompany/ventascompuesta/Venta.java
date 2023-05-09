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
public class Venta {

    IEstrategiaPreciosVenta estrategia;
    LineaDeVenta lv = new LineaDeVenta();

    /*Venta(IEstrategiaPreciosVenta estrategia) {
        this.estrategia = estrategia;
    }*/

    public float obtenerTotal(IEstrategiaPreciosVenta estrategia, float total) {
        //System.out.println(total);
        return (estrategia.obtenerTotal(total));
    }

    public float ObtenerTotalAntesDescuento() {
        float total = lv.obtenerSubTotal();
        return total;
    }

    public void setLineadeVenta(LineaDeVenta lv) {
        this.lv = lv;
    }

}
