/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation1_larnac;

/**
 *
 * @author Anaëlle
 */
public class Voiture {
  String Modele;
  String Marque; 
  int PuissanceCV;
  @Override
    public String toString () {
    String rep;
    rep=("Modele = "+Modele+"Marque = "+Marque+"Puissance"+PuissanceCV);
    return rep;
    }
    public Voiture(String Lemodele, String Lamarque, int puissance) {
 Modele = Lemodele;
 Marque = Lamarque;
 PuissanceCV=puissance;
}
}
