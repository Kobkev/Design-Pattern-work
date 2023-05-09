package com.mycompany.historial;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.LinkedList;
//import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin Verelst
 */
public class Elemento {

    String anterior;    //Scanner sc = new Scanner(System.in);
    //Scanner scc = new Scanner(System.in);
    LinkedList<String> elemento = new LinkedList<>();
    String ele;
    int indice;

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public String getEle() {
        return ele;
    }

    public void setEle(String ele) {
        this.ele = ele;
    }

    public void Agregar() {
        String ele = JOptionPane.showInputDialog(null, "Que es lo que deseas agregar?: ", "Agregar", JOptionPane.QUESTION_MESSAGE);
        //System.out.println("Que es lo que deseas agregar?: ");
        //ele = sc.nextLine();
        elemento.add(ele);
        Update();
    }

    public void Remover() {
        String ele = JOptionPane.showInputDialog(null, "Que es lo que deseas remover?: ", "Remover", JOptionPane.QUESTION_MESSAGE);
        //System.out.println("Que es lo que deseas remover?: ");
        //ele = sc.nextLine();
        for (String s : elemento) {
            if (s.contains(ele)) {
                elemento.remove(ele);
            }
            /*else if (!s.contains(ele)) {
                System.out.println("No se encontro dicho elemento.");
            }*/
        }
        Update();
    }

    public void Obtener() {
        //indice = 0;
        String ele = JOptionPane.showInputDialog(null, "Indica el indice que quieres buscar: ", "Obtener", JOptionPane.QUESTION_MESSAGE);
        int indice = Integer.parseInt(ele);
        //System.out.println("Indica el indice que quieres buscar: ");
        //indice = scc.nextInt();
        for (int i = 0; i < elemento.size(); i++) {
            if (i == indice) {
                JOptionPane.showMessageDialog(null, "El elemento del indice " + indice + " es " + elemento.get(i), "Elemento encontrado", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        //Update();
    }

    public void Update() {

        for (String s : elemento) {
            System.out.println(s);
        }
        System.out.println("- - - - - - - -");
    }
}
