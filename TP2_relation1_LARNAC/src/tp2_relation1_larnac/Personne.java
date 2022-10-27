/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation1_larnac;

/**
 *
 * @author Anaëlle
 */
public class Personne {//attribut de personne
    String nom;
    String prenom;

    
    public Personne(String lenom, String leprenom) {//constructeur de personne
 lenom = nom;
 leprenom = prenom;
 liste_voitures = new Voiture [3] ;
}
    
@Override
    public String toString () {//méthode pour afficher correctement personne
    String rep1;
    rep1=("Nom = "+nom+"Prenom = "+prenom);
    return rep1;
}
    int nbVoitures ;//initialisation du nombre de voitures
Voiture [] liste_voitures ;
 

public boolean ajouter_voiture( Voiture voiture_a_ajouter) {
    if(voiture_a_ajouter.Proprietaire==null){//association de la voiture au propriétaire
        if (nbVoitures<3){//si le nombre max de voitures est présent
            return true;
        }
        
    }else{//ajout de voiture
        this.liste_voitures[this.nbVoitures] = voiture_a_ajouter;
        nbVoitures+=nbVoitures;
        voiture_a_ajouter.Proprietaire = this ;
        
        return false;
    }
        return false;
}
}


