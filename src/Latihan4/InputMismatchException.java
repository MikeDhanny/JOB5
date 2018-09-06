/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

import java.util.Scanner;

/**
 *
 * @author Mikedhanny
 */
public class InputMismatchException {
    public static void main(String[] args) {
         //int a =100;
        System.out.println("Masukan nilai a");
        Scanner console = new Scanner(System.in);
        int a =console.nextInt();
        System.out.println("Masukan nilai b");
        int c = console.nextInt();
       int res=10/(b-c);
       System.out.println("Hasilnya adalah  "+res);
    }
  
}
