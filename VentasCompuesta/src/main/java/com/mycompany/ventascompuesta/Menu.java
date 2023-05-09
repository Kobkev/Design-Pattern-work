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
public class Menu {

    public static void main(String[] args) {
        DescripcionProducto dp = new DescripcionProducto();
        LineaDeVenta lv = new LineaDeVenta();
        IEstrategiaPreciosVenta estrategia;
        Venta v = new Venta();
        // AGREGA NUEVA VENTA
        dp.fijarPrecio(100);
        lv.setCantidad(5000);
        lv.setDescripcionProdcuto(dp);
        v.setLineadeVenta(lv);
        // OBTIENE VENTA SIN DESCUENTO
        float p = v.ObtenerTotalAntesDescuento();

        System.out.println("La subtotal es: " + p);
        
        // APLICA EL VALOR SIN DESCUENTO A CADA UNA DE LAS ESTRATEGIAS COMPUESTAS
        estrategia = new EstrategiaDescuentoAbsolutoSobreUmbral();

        System.out.println("El precio final con descuento con umbral es: " + v.obtenerTotal(estrategia, p));

        estrategia = new EstrategiaPorcentajeDescuento();

        System.out.println("El precio final con descuento del 50% es: " + v.obtenerTotal(estrategia, p));

        estrategia = new EstrategiaLoMejorParaTienda();
        
        System.out.println("El precio final para lo mejor de la tienda es: " + v.obtenerTotal(estrategia, p));
    }
}
