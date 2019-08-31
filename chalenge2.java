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
public class chalenge2 {
     public static void main(String[] args) {
         
         double nilaiA;
         double nilaiL;
         double nilaiU;
         double nilai;
         double nilaiTH;
         Scanner dam= new Scanner (System.in);
        
         System.out.println("=======program nilai siswa=======");
         System.out.println(">>Masukan nilai tugasharian siswa: <<"); 

         double nilaitugasharian=dam.nextDouble();
         nilaiTH= nilaitugasharian * 0.3;
         System.out.println(">>>>nilai tugas harian siswa "
                 + "adalah : " + nilaiTH);
         System.out.println(">>Masukan Nilai Laporan: <<");
         double nilailaporan=dam.nextDouble();
         nilaiL= nilailaporan * 0.2;
         System.out.println(">>>>nilai laporan siswa adalah : " +nilaiL );
         System.out.println(">>>>masukan nilai ujian siswa : ");
         double nilaiujian=dam.nextDouble();
         nilaiU= nilaiujian * 0.5;
         System.out.println(">>>>nilai ujian siswa adalah : " + nilaiU);
         System.out.println("Berikut adalah nilai akhir siswa");
         nilaiA = nilaiTH + nilaiL + nilaiU;
         System.out.println(">>>>Total nilai akhir siswa adalah : " + nilaiA);
         
         if (nilaiA<=40){
             System.out.println("F (anda tidak lulus tingkatkan"
                     + " belajar anda)");
         }else if(nilaiA <= 55){
              System.out.println("E (anda tidak lulus tingkatkan "
                      + "belajar anda)");
         }else if(nilaiA <= 74){
             System.out.println("D (anda lulus dengan cukup tingkatkan "
                     + "belajar anda)");
         }else if(nilaiA <= 85){
             System.out.println("C (anda lulus dengan cukup tingkatkan  "
                     + "prestasimu)");
         }else if(nilaiA <=92){
             System.out.println("B (anda lulus dengan baik pertahankan "
                     + "prestasimu )");
         }else if(nilaiA <=100){
             System.out.println("A(anda lulus EXCELENT!!!)");
         }
         
            
             
         
         
         
         
      
         
         
         
         
     }
    
}
