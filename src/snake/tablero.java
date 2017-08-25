/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;

/**
 *
 * @author Dino
 */
public class tablero {
    
    private final int An;
    private final int Al;
    public final char [][] ventana;
            
    public tablero(int An, int Al){
    this.An = An;
    this.Al = Al;
    this.ventana = ventana;
    
    public void ventana(){
        for(int i=0; i< this.An ;i++){
            for(int j=0; j< this.Al; j++){
                this.ventana[i][j] = ' ';
            
            }
        System.out.println();
        }
    
    }
    
}
    