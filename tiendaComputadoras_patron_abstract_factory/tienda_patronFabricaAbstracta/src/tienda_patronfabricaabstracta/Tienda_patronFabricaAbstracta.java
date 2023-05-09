/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda_patronfabricaabstracta;

import Empresas_Equipos.AppleTiendaComp;
import Empresas_Equipos.DellTiendaComp;
import clases.Computadora;
import clases.TiendaComputadoras;
import java.util.Scanner;

/**
 * * @author Beatriz González
 */
public class Tienda_patronFabricaAbstracta {

    public static void main(String[] args) {
        TiendaComputadoras dellTienda = new DellTiendaComp(); //polimorfimos en accion
        TiendaComputadoras appleTienda = new AppleTiendaComp();

        System.out.println("Elije opcion 1 para hacer tu pedido de una computadora DELL u opcion 2 para una Apple y -1 para salir");
        Scanner sc = new Scanner(System.in); //objeto para pedir una entrada en consola

        int bandera = 0;
        int opt = sc.nextInt();

        while (opt != -1) {
            switch (opt) {
                //computadoras DELL
                case 1: //computadoras Dell
                    System.out.println("Que tipo de procesador deseas( i5 o i7)");
                    Scanner le = new Scanner(System.in);
                    String lee = le.next();
                    if (lee.equals("i5")) {
                        Computadora compu = dellTienda.ordenarComputadora("procesador i5");
                        System.out.println("hacemos pedido " + compu + "\n");
                        break;
                    }
                    if (lee.equals("i7")) {
                        System.out.println("Que capacidad de disco duro deseas(256 GB o 512 GB) elije opcion 1 u opcion 2");
                        Scanner le2 = new Scanner(System.in);
                        String lee2 = le2.next();
                        if (lee2.equals("1")) {
                            Computadora compu = dellTienda.ordenarComputadora("procesador i7");
                            System.out.println("hacemos pedido " + compu + "\n");
                            break;
                        } else {
                            Computadora compu = dellTienda.ordenarComputadora("procesador i7 v2");
                            System.out.println("hacemos pedido " + compu + "\n");
                            break;
                        }
                    }

                //computadoras APPLE
                case 2:
                    System.out.println("Que almacenamiento de disco duro deseas( 256 GB o 512 GB)");
                    Scanner le3 = new Scanner(System.in);
                    String lee3 = le3.nextLine();
                    if (lee3.equals("256 GB")) {
                        Computadora compu = appleTienda.ordenarComputadora("256 GB");
                        System.out.println("hacemos pedido " + compu + "\n");
                        break;
                    } else {
                        Computadora compu = appleTienda.ordenarComputadora("512 GB");
                        System.out.println("hacemos pedido " + compu + "\n");
                        break;
                    }

                default:
                    System.out.println("Opcion Invalida");
                    break;
            }//fin del switch

            System.out.println("Elije opcion 1 para hacer tu pedido de una computadora DELL u opcion 2 para una Apple y -1 para salir");
            sc = new Scanner(System.in); //objeto para pedir una entrada en consola
            opt = sc.nextInt();
            bandera++;
        }


        /*   Computadora compu = dellTienda.ordenarComputadora("procesador i5");
        System.out.println("hacemos pedido " + compu + "\n");
        
        compu = dellTienda.ordenarComputadora("procesador i7");
        System.out.println("hacemos pedido " + compu + "\n");
        
        compu = dellTienda.ordenarComputadora("procesador i7 v2");
        System.out.println("hacemos pedido " + compu + "\n");*/
 /*  Computadora compu = appleTienda.ordenarComputadora("256 GB");
        System.out.println("hacemos pedido " + compu + "\n");
        
        compu = appleTienda.ordenarComputadora("512 GB");
        System.out.println("hacemos pedido " + compu + "\n");*/
    }

}
