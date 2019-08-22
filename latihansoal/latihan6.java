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
public class latihan6 {
    
    public static void main(String[] args){
        int x=12;// dikonversi ke biner 0000 1100
        int y=20;// dikonversi ke biner 0001 0100
         
        int z;
        z = x | y;
        System.out.println("hasi operasi bitwise OR :" + z);
        
        z= x & y;
        System.out.println("hasil operasi bitwise AND : " + z);
        
        z = x ^ y;
        System.out.println("hasil operasi bitwise XOR : " + z);
        
        z= ~x;
        System.out.println("hasil operasi bitwise NOT : " + z);
        
        z= x << 3;
        System.out.println("hasil operasi bitwise shift left : " + z);
        
        z= y >> 2;
        System.out.println("hasil operasi bitwise shift right : " + z);
        
        
        
        
    
    
    
    
    
    
    
    
    
    
    }
    }
    

