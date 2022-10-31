/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_larnac;

import java.util.Scanner;

/**
 *
 * @author Anaëlle
 */
public class TP1_manipNombresInt_LARNAC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nb1;
        double nb2;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer un premier nombre");
        nb1=sc.nextInt();
        System.out.println("\n Entrer un deuxième nombre");
        nb2=sc.nextInt();
        System.out.println("\n Le premier nombre est : "+nb1);
        System.out.println("\n Le deuxième nombre est : "+nb2);
        double Add;
        Add=nb1+nb2;
        System.out.println("addition des 2 nombres choisis donne : "+nb1+" + "+nb2+" = "+Add);
        
        double Diff;
        Diff=nb1-nb2;
        System.out.println("soustraction des 2 nombres choisis donne : "+nb1+" - "+nb2+" = "+Diff);
        
        double Mult;
        Mult=nb1*nb2;
        System.out.println("multiplication des 2 nombres choisis donne : "+nb1+" * "+nb2+" = "+Mult);
        
        double Div;
        Div=nb1/nb2;
        double Mod;
        Mod=nb1%nb2;
        System.out.println("division des 2 nombres choisis donne : "+nb1+" / "+nb2+" = "+Div+"\n"+" le reste de la divison est de : "+Mod);
    }
    
}
