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
public class jobsheet6 {
    public static void main(String[] args) {
        String identitas = " Ruqul Adam Himawan " + " XRPL02 " + " 33 ";
        System.out.println("identitas : " + identitas);
        
                java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Nilai a ?");
        int a = scanner.nextInt();
        
        
        System.out.println("\nIF..1");
        if(a < 5){
            System.out.println ("nilai a kurang dari 5");
        } else if (a == 5){
            System.out.println("nilai a sama dengan lima");
        } else
                System.out.println("nilai a lebih dari lima");
            
    System.out.println("nIF.. ELSE... IF... ELSE.. 2");
    if (a<2){
        System.out.println("nilai a kurang dari 2");
    }
        else if(a < 4){
            System.out.print("nilai a kurang dari 4");
        }
        else if (a < 6){
            System.out.println("nilai a kurang dari 6");
           
        }
        else if (a == 6){
            System.out.println("nilai a sama dengan 6");
        }
        else {
            System.out.println("nilai a lebih dari 6");
        }
        System.out.println("\nNested IF");
        if (a < 7){
            System.out.println("nilai a kurang dari 7");
        }
        if (a > 2){
            System.out.println("nilai a lebih besar dari");
        }
        if (a < 4) {
            System.out.println("nilai a kurang dari 4");
        }
        
        System.out.println("nSWITCH... CASE..");
        switch(a){
            case 1 : System.out.println("nilai a => 1"); break;
            case 2 : System.out.println("nilai a => 2"); break;
            case 3 :
            case 4 : System.out.println("nilai a => 3 atau 4 "); break;
            case 5 : System.out.println("nilai a => 5"); break;
            default : System.out.println("nilai a bukan antara 1 sampai 5"); break;
            
           }
    int nilai;
    System.out.print("\nNilai anda ? ");
    nilai = scanner.nextInt();
    
    String grade =  (nilai<75) ? "belum kompeten" : "kompeten";
    System.out.println(nilai + "==>" + grade );
    
    }
    
}

