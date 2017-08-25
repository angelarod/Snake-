/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;

import java.util.Arrays;

/**
 *
 * @author Dino
 */
public class comida {
    public void alimento(){
        int alimento[][] = new int[10][10];

        int fila = (int) (Math.random() * 10);
        int columna = (int) (Math.random() * 10);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                alimento[fila][columna] = 3;

            }

        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                System.out.println(Arrays.toString(alimento) + "");

            }

        }

    }
    
   }
