/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation1_larnac;

/**
 *
 * @author Anaëlle
 */
public class Personne {
    String nom;
    String prenom;
    int voiture=0;
    
    public Personne(String lenom, String leprenom) {
 lenom = nom;
 leprenom = prenom;
 liste_voitures = new Voiture [3] ;
}
    
@Override
    public String toString () {
    String rep1;
    rep1=("Nom = "+nom+"Prenom = "+prenom);
    return rep1;
}
    int nbVoitures ;
Voiture [] liste_voitures ;
}
