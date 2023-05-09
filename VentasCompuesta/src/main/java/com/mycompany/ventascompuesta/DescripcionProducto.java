package com.mycompany.ventascompuesta;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//import java.util.ArrayList;
//import java.util.List;

/**
 *
 * @author Kevin Verelst
 */
public class DescripcionProducto {

    //int idProducto;
    //String descripcion;
    float precio;

    public void fijarPrecio(float precio) {
        this.precio = precio;
    }

    public float obtenerPrecio() {
        return precio;
    }
}
