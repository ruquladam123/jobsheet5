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
public class jobsheet8 {
    public static void main(String[] args) {
        Scanner tugas = new Scanner(System.in);
                double pajak;
                double biayaa;
                double biayab;
                double biayac;        
                double kwh;
                double total;
                //golongan a
                double tariflangganana = 5000;
                double hargakwha       = 3000;
                
                //golongan b
                double tariflanggananb = 3500;
                double hargakwhb       = 2500;
              
                //golongan c
                double tariflanggananc = 2000;
                double hargakwhc       = 1000;
               
                        
                
                
                
                 System.out.print("Masukan nilai pemakaian :");
                 int pemakaian = tugas.nextInt();
                 if (pemakaian <=450){
                     System.out.println("golongan c (miskin slur)");
                     biayaa = tariflangganana + (pemakaian * hargakwha);
                     System.out.println("biaya lho gaboleh ngutang :" + biayaa);
                     pajak=0.2 * biayaa;
                     System.out.println("pajaknya jan lupa" + pajak);
                     total = pajak + biayaa;
                     System.out.println("total nya gaynn" + total);
                 }else if(pemakaian <=900){
                     System.out.println("golongan b (lumayan kaya nih)");
                     biayab = tariflanggananb + (pemakaian * hargakwhb);
                     System.out.println("biaya slurr :" + biayab);
                     pajak=0.15 * biayab;
                     System.out.println("pajak(bayar lah gan) : ");
                     total = pajak + biayab;
                     System.out.println("totalnya slurr : " + total);
                     
                 }else if (pemakaian <=1200){
                     System.out.println("golongan a(pelaku pembuang macbook)");
                     biayac = tariflanggananc + ( hargakwhc * pemakaian  );
                     System.out.println("biayanya keluarga" + biayac );
                     pajak = 0.1 * biayac;
                     System.out.println("pajak ultah slur" + pajak);
                     total = pajak + biayac;
                     System.out.println("total bayar ganns" + total);
                 }
    }
}
                     
                 
                 
    
    
                     
    

