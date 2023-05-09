
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevvvvvy
 */
public class Inventario {
    private String producto;
    private Operacion unaOperacion;
    private ArrayList inventario;
    
    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Inventario(String producto) {
        this.producto = producto;
    }

    public Inventario(Operacion unaOperacion) {
        this.unaOperacion = unaOperacion;
    }
    
    
    public void Lista(){
        inventario = new ArrayList();
    }
}
