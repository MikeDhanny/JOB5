/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author Mikedhanny
 */
public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int [] nums={1,2,3};
      nums[2]=4;
        System.out.println("Nilai pada Index adalah : "+nums[2]);
    }
    
}
