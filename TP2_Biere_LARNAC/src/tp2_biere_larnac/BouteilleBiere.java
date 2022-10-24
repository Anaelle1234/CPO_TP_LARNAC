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
    public void Décapsuler(){
        if (ouverte==false){
            ouverte=true;
            System.out.println("la biere est maintenant ouverte");
        }else{
            System.out.println(" erreur : biere déjà ouverte");
            ouverte=false;
        }
    }
public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
 nom = unNom;
 degreAlcool = unDegre;
 brasserie = uneBrasserie;
 ouverte = false;
}
}