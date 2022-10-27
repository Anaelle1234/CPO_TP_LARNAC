/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation1_larnac;

/**
 *
 * @author Anaëlle
 */
public class TP2_relation1_LARNAC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        System.out.println("liste des voitures disponibles "+ uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
        
        bob.liste_voitures[0] = uneClio ;
        if(bob.ajouter_voiture(uneClio)==true && bob.nbVoitures<3){
            bob.nbVoitures+=1;
        }
        uneClio.Proprietaire = bob ;
        System.out.println("la premiere voiture de Bob est " + bob.liste_voitures[0]) ;
        
        
        bob.liste_voitures[1]= uneAutreClio;
        if(bob.ajouter_voiture(uneAutreClio)==true && bob.nbVoitures<3){
            bob.nbVoitures+=1;
        }
        uneAutreClio.Proprietaire = bob ;
        System.out.println("la deuxième voiture de Bob est " + bob.liste_voitures[1]) ;
        
        
        reno.liste_voitures[0] = une2008 ;
        if(reno.ajouter_voiture(une2008)==true && reno.nbVoitures<3){
            reno.nbVoitures+=1;
        }
        une2008.Proprietaire=reno;
        System.out.println("la premiere voiture de Reno est " + reno.liste_voitures[0]) ;
        
        reno.liste_voitures[1]=uneMicra;
        if(reno.ajouter_voiture(uneMicra)==true && reno.nbVoitures<3){
            reno.nbVoitures+=1;
        }
        uneMicra.Proprietaire = reno ;
        System.out.println("la deuxième voiture de Reno est " + reno.liste_voitures[1]) ;
    }
    
    
}
