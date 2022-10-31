/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_larnac;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Anaëlle
 */
public class TP1_guessMynumber_LARNAC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Random generateurAleat = new Random();  
    int n = generateurAleat.nextInt(100); 
    System.out.println(n);
    Scanner sc = new Scanner(System.in);
    System.out.println("\n Entrer le nombre :");
    int user = sc.nextInt();
    System.out.println("\n Entrer le nombre :");
    int cpt;
    cpt=0;
    System.out.println("Choissisez le mode de jeu: \n 1.Facile \n 2.Moyen \n 3.Difficile");
    int niveau;
    niveau=sc.nextInt();

    while (user!=n){

    if (user<n){
        System.out.println("le nombre est plus grand, Recommencez!");
        cpt+=1;
        user=sc.nextInt();
    }
    if (user>n){
        System.out.println("le nombre est plus petit,Recommencez!");
        cpt+=1;
        user=sc.nextInt();
    }
    if (user==n){
        System.out.println("gagné!");
        cpt+=1;
        System.out.println("nombre de tentatives : "+cpt);
        
    }
    
    }
}
}
