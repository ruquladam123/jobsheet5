/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inyourdreams;

/**
 *
 * @author In your dream
 */
import java.util.Scanner;

public class sistemluassegitiga {
    public static void main(String[] args) {
        //deklarasi
        double luas;
                int alas, tinggi;
                
                //membuat scanner baru gaess
                Scanner baca = new Scanner(System.in);
                 //input gaess
                 System.out.println(">>program luas segitiga gaes<<");
                 System.out.print("input alas gaynn =");
                 alas = baca.nextInt();
                 System.out.print("input tinggi jangan lupa juga=");
                 tinggi = baca.nextInt();
                 
                 //executenya gan
                 luas = Double.valueOf((alas* tinggi) /2);
                 
                 
                 //jeng jeng jeng
                 System.out.print("luas=" + luas);
                 
        
        
}
}