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
import java.util.ArrayList;
import java.util.List;

abstract class EstrategiaCompuesta implements IEstrategiaPreciosVenta {

    public List<IEstrategiaPreciosVenta> estrategias = new ArrayList<IEstrategiaPreciosVenta>();

    public float obtenerTotal(Venta venta) {
        throw new UnsupportedOperationException();
    }

    //public void agregarEstrategia(IEstrategiaPreciosVenta);
}
