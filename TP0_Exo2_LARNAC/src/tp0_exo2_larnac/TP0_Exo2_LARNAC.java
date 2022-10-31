/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_exo2_larnac;

import java.util.Scanner;

/**
 *
 * @author Anaëlle
 */
public class TP0_Exo2_LARNAC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaration des variables
int nb; // nombre dentiers a additionner

int result; // resultat
 //indice

// Addition des nb premiers entiers



Scanner sc = new Scanner(System.in);
System.out.println("\n Entrer le nombre :");
nb=sc.nextInt(); // On demande a sc de donner le prochain entier

result=0;
for (int ind=1;ind <= nb;ind++) {
    result=result+ind;
}
// Affichage du resultat
System.out.println("La somme des "+ nb + " entiers est: "+result);
}
}
    
