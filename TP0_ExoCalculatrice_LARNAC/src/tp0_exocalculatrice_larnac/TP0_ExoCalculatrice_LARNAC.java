/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_exocalculatrice_larnac;

import java.util.Scanner;

/**
 *
 * @author Anaëlle
 */
public class TP0_ExoCalculatrice_LARNAC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float resultat;
        float operateur;
        float operande1;
        float operande2;
        System.out.println("Please enter the operator: 1) add  2) substract 3) multiply  4) divide 5) modulo");
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer l'operateur :");
        operateur=sc.nextFloat(); 
        
        System.out.println("\n Entrer le premier terme :");
        operande1=sc.nextFloat(); 
        System.out.println("\n Entrer le deuxième terme :");
        operande2=sc.nextFloat(); 
        if (operateur==1){//addition
            resultat=operande1+operande2;
            System.out.println("\n Le résultat est :"+resultat);
        }
           if (operateur==2){//soustraction
            resultat=operande1-operande2;
            System.out.println("\n Le résultat est :"+resultat);
        }
              if (operateur==3){//multiplication
            resultat=operande1*operande2;
            System.out.println("\n Le résultat est :"+resultat);
        }
                 if (operateur==4){//division
            resultat=operande1/operande2;
            System.out.println("\n Le résultat est :"+resultat);
        }
                    if (operateur==5){//modulo
            resultat=operande1%operande2;
            System.out.println("\n Le résultat est :"+resultat);
        }
    }
    
    
}
