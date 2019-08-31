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
public class chalenge1 {
    public static void main(String[] args) {
      double jumlahpenjualan2;
      double jumlahpenjualan3;
      double jumlahpenjualan4 = 0;
      double jumlahpenjualan5 = 0;
        Scanner iyd= new Scanner(System.in);
        
        System.out.println("====== Program Marketing slur ======");
        System.out.println(">> Masukan HasilPenjualanGan : <<");  
        double jumlahpenjualan = iyd.nextDouble(); 
        if (jumlahpenjualan <=20000){
            System.out.println("Selamat anda mendapat komisi 10% gann"
                + "dan juga uang jasa 10000");
                        jumlahpenjualan = (jumlahpenjualan * 0.1) + 10000 ;
        System.out.println("===Jadi omset anda adalahhh : " + 
                jumlahpenjualan + "(Lumayan buat beli indomie slur)===");   
        }else if (jumlahpenjualan <=50000){
            System.out.println("Selamat anda mendapat komisi 15% gaynnn"
                    + "dan uang jasa 20000");
                    jumlahpenjualan2 = (jumlahpenjualan * 0.15) + 10000;
            System.out.println("=====Jadi omset agan ialahh : " +
                    jumlahpenjualan2 + "Lumayan bisa buat kencan gan====");
            
        }else if (jumlahpenjualan <=100000){
            System.out.println("Selamat anda mendapat komisi 20% gayss"
                    + "dan uang jasa 30000 ");
            jumlahpenjualan3 = (jumlahpenjualan * 0.2) + 20000;
            
            System.out.println("====Jadi omset kitaa adalah : "
                    + jumlahpenjualan3 + "Lumayan buat modal nikah====");
            
        }else if (jumlahpenjualan <= 150000){
            System.out.println("Selamat anda mendapat komisi 30% slur "
                    + "dan uang jasa 50000");
            jumlahpenjualan4 = (jumlahpenjualan4 * 0.3) + 50000;
            System.out.println("====Jadi omset klean adalah : "
                    + jumlahpenjualan4 + "auto shopping sloerrr====");
            
        }if (jumlahpenjualan >=151000){
            System.out.println("Selamat anda mendapat komisi 40%"
                    + "dan uang jasa 75000 " );
            jumlahpenjualan5 = (jumlahpenjualan * 0.4) + 75000;
            System.out.println ("Total uang anda adalah :  " + jumlahpenjualan5 );
        }   
        
    }
}
