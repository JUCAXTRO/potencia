/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package potencia;

import java.util.Scanner;

/**
 *
 * @author Usuário
 */
public class Potencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int i=1;
       
       while(i<=15)
       {
           int p =(int) Math.pow(3, i);
           System.out.println(p);
           i=i+1;
       }
    }
    
}
