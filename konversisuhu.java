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
public class konversisuhu {
    public static void main(String[] args) {
        //deklarasionnnn gessssss :Voss
        double suhu;
        int celcius, fahrenheit;
            //membuat scanner baru gaess
                Scanner baca = new Scanner(System.in);
                 //input gaess
                 System.out.println(">>program konversi suhu gaynnn :voss<<");
                 System.out.print("input celcius gaynn =");
                 celcius = baca.nextInt();
            
                 
                 //executenya gan
                  suhu = Double.valueOf((9 * celcius / 5) +32);
                 
                 
                 //jeng jeng jeng
                 System.out.print("suhu=" + suhu);
                 
    
        
    }
    
}
