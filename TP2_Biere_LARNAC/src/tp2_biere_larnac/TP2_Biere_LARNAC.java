/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_biere_larnac;

/**
 *
 * @author Anaëlle
 */
public class TP2_Biere_LARNAC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",7.0,"Dubuisson") ;
    BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6,"Abbaye de Leffe");  
    BouteilleBiere secondeBiere = new BouteilleBiere("Guiness",5.0,"Dublin");
    BouteilleBiere troisiemeBiere = new BouteilleBiere("HK",5.2,"Hollande");
    BouteilleBiere quatriemeBiere = new BouteilleBiere("1664",5.4,"Europe");
    
    
    
    uneBiere.Décapsuler();
    System.out.println(uneBiere);
    System.out.println(autreBiere);
    System.out.println(secondeBiere);
    System.out.println(troisiemeBiere);
    System.out.println(quatriemeBiere);
    
 
}
}
