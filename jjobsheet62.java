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
public class jjobsheet62 {
    public static void main(String[] args) {
        String identitas = ("Ruqul Adam Himawan / XRPL02 / 33");
        System.out.println(" identitas : " + identitas);
        
        System.out.println("nSaran resep Dari Bahan Milik Anda");
         
        Scanner scanner = new Scanner (System.in);
         System.out.println("bahan pertama : ");
         System.out.println("1. Pisang");
         System.out.println("2. Telur");
         System.out.print("masukan bahan pilihan anda : ");
         
         int bahan1 = scanner.nextInt();
if (bahan1 == 1 || bahan1 == 2)
{
    System.out.println("bahan kedua");
    if(bahan1 == 1) {
        System.out.println("1. Susu ");
        System.out.println("2. Minyak Goreng");
        System.out.println("3. Tidak Ada");
    }else{
        System.out.println("1. Minyak Goreng" );
        System.out.println("2. Roti");
        System.out.println("3. Tidak Ada");
    }
    System.out.print("Masukan No Pilihan Anda : ");
    int bahan2 = scanner.nextInt();
    
    
}else
    System.out.println("Mohon maaf, pilihan anda tidak ditemukan,"
            + "tidak dapat melihat resep");
 
 System.out.println("Masukan no pilihan anda : ");
 int bahan2 = scanner.nextInt();
 
         
         if (bahan2 >= 1 && bahan2 <= 3 )
         {
             if (bahan1==1)
                 switch (bahan2)
                 {
             case 1 : System.out.println(
             "anda dapat membuat milk shake banana");break;
             case 2 : System.out.println(
             "anda dapat membuat pisang ");break;
             case 3 : System.out.println(
             "anda dapat membuat pisang rebus");
             
        
    }
             else
                 switch (bahan2)
                 {
                     case 1 : System.out.println (
                     "anda dapat membuat telur mata sapi");break;
                     case 2 : System.out.println(
                     "anda dapat membuat sandwich telur");break;
                     case 3 : System.out.println(
                     "telur rebus");
                 }
        
         
                 
    }else
             System.out.println("Mohon maaf pilihan anda tidak ditemukan"
                     + "tidak dapat menambahkan resep");
    
}
}
