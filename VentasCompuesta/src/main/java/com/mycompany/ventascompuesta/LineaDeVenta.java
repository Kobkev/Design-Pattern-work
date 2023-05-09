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
public class LineaDeVenta {

    int cantidad;

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    DescripcionProducto desp = new DescripcionProducto();

    public void setDescripcionProdcuto(DescripcionProducto desp) {
        this.desp = desp;
    }

    public float obtenerSubTotal() {
        float total = desp.obtenerPrecio();
        return total * cantidad;

    }
}
