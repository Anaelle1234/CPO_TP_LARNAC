/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_biere_larnac;

/**
 *
 * @author Anaëlle
 */
public class BouteilleBiere {//création de la classe bouteille biere avec les noms des attributs
    String nom;
    Double degreAlcool;
    String brasserie;
    boolean ouverte;
    
    //crétaion méthode étiquette
    public void lireEtiquette() {
    System.out.println("Bouteille de " + nom +" (" + degreAlcool +" degres) \nBrasserie : " + brasserie ) ;
    }
    //création méthode décapsuler
    public void Décapsuler(){
        if (ouverte==false){//si la biere n'est pas décapsulée on la décapsule
            ouverte=true;
            System.out.println("la biere est maintenant ouverte");//on affiche le résultat
        }else{
            System.out.println(" erreur : biere déjà ouverte");// si la biere est déjà ouverte on affiche une erreur
            ouverte=false;
        }
    }
//changement pour pouvoir avoir une syntaxe "officiel" afin de raccourcir l'écriture   
public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
 nom = unNom;
 degreAlcool = unDegre;
 brasserie = uneBrasserie;
 ouverte = false;
}
@Override
public String toString() {
String chaine_a_retourner;
chaine_a_retourner = nom + " (" + degreAlcool + " degrés) Ouverte ? ";
if (ouverte == true ) chaine_a_retourner += "oui" ;
else chaine_a_retourner += "non" ;
return chaine_a_retourner ;
}
}