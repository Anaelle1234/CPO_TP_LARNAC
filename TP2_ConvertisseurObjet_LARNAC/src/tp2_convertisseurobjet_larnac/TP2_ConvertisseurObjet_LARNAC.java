/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_larnac;

import java.util.Scanner;

/**
 *
 * @author Anaëlle
 */
public class TP2_ConvertisseurObjet_LARNAC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc;
        sc=new Scanner(System.in);
        
        double saisinb;//le nombre que saisi l'utilisateur
        saisinb=0;
        double saisiconv;//le nombre de la comparaison qu'il souhaite
        saisiconv=0;
        double valeur;//le résultat de la conversion
        valeur=0;
        Convertisseur c = new Convertisseur();//création de l'objet convertisseur
        System.out.println("Entrer la température");
        saisinb=sc.nextDouble();//demande de saisi sur l'interface
        System.out.println("Choisissez le numéro de la conversion");
        System.out.println("Index numéro de conversion : \n 1:CelciusVersKelvin \n 2:KelvinVersCelcius \n 3:FahrenheitVersCelcius \n 4:CelciusVersFahrenheit \n 5:FahrenheitVersKelvin \n 6:KelvinVersFahrenheit");
        saisiconv=sc.nextDouble();//saisi sur l'interface
        
        
        //si l'utilisateur choisi la conversion 1
        if (saisiconv==1){
            valeur=c.CelciusVersKelvin(saisinb);//on récupère le calcul de conversion avec le nombre saisi
            System.out.println(valeur+"K");//affichage du résulat dans l'unité correspondante
        }
        //même méthode pour les autres saisiconv
         if (saisiconv==2){
            valeur=c.KelvinVersCelcius(saisinb);
            System.out.println(valeur+"C");
        }
         if (saisiconv==3){
            valeur=c.FahrenheitVersCelcius(saisinb);
            System.out.println(valeur+"C");
        }
          if (saisiconv==4){
            valeur=c.CelciusVersFahrenheit(saisinb);
            System.out.println(valeur+"F");
        }
        
           if (saisiconv==5){
            valeur=c.FahrenheitVersKelvin(saisinb);
            System.out.println(valeur+"K");
        }
        if (saisiconv==6){
            valeur=c.KelvinVersFahrenheit(saisinb);
            System.out.println(valeur+"F");
        } 
  
        
    }
    
}
