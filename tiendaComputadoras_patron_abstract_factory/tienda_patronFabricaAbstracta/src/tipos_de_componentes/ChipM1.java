/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipos_de_componentes;

import componentes.Procesador;

/**
 * * @author Beatriz González
 */
public class ChipM1 implements Procesador{
    @Override
    public String toString(){ //el chip es el mismo para los equipos apple
        return "Chip M1 de Apple con CPU de 8 nucleos y GPU de 8 nucleos y Neural Engine de 16 nucleos\n";
    }
}
