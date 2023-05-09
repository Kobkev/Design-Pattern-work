/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.persistencia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Kevin Verelst
 */
public class Conf {

    String formato_archivo = "";

    public Conf() {
    }

    public String Seperador() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("lista.conf"));
            String line = null;

            while ((line = br.readLine()) != null) {
                String tmp[] = line.split("=");
                formato_archivo = tmp[1];
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return formato_archivo;
    }
}
