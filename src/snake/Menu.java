/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Dino
 */
public class Menu {
   @SuppressWarnings("empty-statement")
   public static void main(String[] args){
       System.out.println("MENU");
       String Nombre = "";
       Scanner name = new Scanner(System.in);
       System.out.println("Ingese nombre");
       Nombre=name.next();
      
       System.out.println("ingrese tamaño de tablero mxn (tamaño minimo 10x10)");
       String m = "";
       Scanner tamx = new Scanner(System.in);
        System.out.println("ingrese tamaño en m");
       Nombre = tamx.next();
      
       String n = "";
       Scanner tamy = new Scanner(System.in);
       System.out.println("ingrese tamaño en n");
       Nombre = tamy.next();
       
       String puntos = "";
       Scanner puntj = new Scanner(System.in);
       System.out.println("puntos");
       Nombre = puntj.next();
       
}
    public void jugador() {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(in);
        
       System.out.println(" ");
   }
        
}
