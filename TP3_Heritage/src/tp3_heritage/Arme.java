/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heritage;

import java.util.Scanner;

/**
 *
 * @author Anaëlle
 */
public class Arme {
    String nom;
    int niveau;
    
    public Arme(String n, int i) {
 nom = n;
 niveau = i;
}
      @Override
public String toString() {
String chaine_a_retourner;
chaine_a_retourner = "nom : " +nom +"\n"+"niveau d'attaque : " +niveau;
return chaine_a_retourner ;
}
        
}
