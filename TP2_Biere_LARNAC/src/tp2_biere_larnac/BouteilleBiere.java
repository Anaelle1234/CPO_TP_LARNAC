/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_biere_larnac;

/**
 *
 * @author Anaëlle
 */
public class BouteilleBiere {
    String nom;
    Double degreAlcool;
    String brasserie;
    boolean ouverte;
    public void lireEtiquette() {
    System.out.println("Bouteille de " + nom +" (" + degreAlcool +" degres) \nBrasserie : " + brasserie ) ;
    }
    
}
