/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_larnac;

import java.util.Scanner;

/**
 *
 * @author Anaëlle
 */
public class TP1_convertisseur_LARNAC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc;
        sc=new Scanner(System.in);
        
        double saisinb;
        System.out.println("entrer une valeur : ");
     
        
        Convert c = new Convert();
        saisinb=sc.nextDouble();//demande de saisi sur l'interface
        System.out.println("Choisissez le numéro de la conversion");
        System.out.println("Index numéro de conversion : \n 1:CelciusVersKelvin \n 2:KelvinVersCelcius \n 3:FahrenheitVersCelcius \n 4:CelciusVersFahrenheit \n 5:FahrenheitVersKelvin \n 6:KelvinVersFahrenheit");
        double saisiconv;
        saisiconv=sc.nextDouble();//saisi sur l'interface
        double valeur;
        
        //si l'utilisateur choisi la conversion 1
        if (saisiconv==1){
            valeur=c.CelciusVersKelvin(saisinb);//on récupère le calcul de conversion avec le nombre saisi
            System.out.println(valeur+"K");//affichage du résulat dans l'unité correspondante
        }
        //même méthode pour les autres saisiconv
         if (saisiconv==2){
            valeur=Convert.KelvinVersCelcius(saisinb);
            System.out.println(valeur+"C");
        }
         if (saisiconv==3){
            valeur=Convert.FahrenheitVersCelcius(saisinb);
            System.out.println(valeur+"C");
        }
          if (saisiconv==4){
            valeur=Convert.CelciusVersFahrenheit(saisinb);
            System.out.println(valeur+"F");
        }
        
           if (saisiconv==5){
            valeur=Convert.FahrenheitVersKelvin(saisinb);
            System.out.println(valeur+"K");
        }
        if (saisiconv==6){
            valeur=Convert.KelvinVersFahrenheit(saisinb);
            System.out.println(valeur+"F");
        } 
    }
}
