/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heritage;

import Personnages.Magicien;
import Personnages.Guerrier;
import Personnages.Personnage;
import Armes.Baton;
import Armes.Arme;
import Armes.Epee;
import java.util.ArrayList;

/**
 *
 * @author Anaëlle
 */
public class TP3_Heritage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  Arme Arc = new Arme("Arc",70) ;
  System.out.println(Arc);
  Baton Charme =new Baton("Charme", 5, 6);
  System.out.println(Charme);
  Baton Chene =new Baton("Chêne", 4, 5);
  System.out.println(Chene);
  Epee Durandal = new Epee("Durandal",4,7);
  System.out.println(Durandal);
  Epee Excalibur = new Epee("Excalibur",7,5);
  System.out.println(Excalibur);
    
  
   ArrayList<Arme> Tab = new ArrayList<Arme>();
   Tab.add(Chene);
   Tab.add(Charme);
   Tab.add(Durandal);
   Tab.add(Excalibur);

System.out.println("la taille du tableau " +Tab.size());
for (int i=0;i<Tab.size();i++) {
    System.out.println(Tab.get(i)); 
} 

Magicien Gandalf = new Magicien("Gandalf",65,true );
System.out.println(Gandalf);
Magicien Garcimore = new Magicien("Garcimore",44,false );
System.out.println(Garcimore);
Guerrier Conan = new Guerrier("Conan", 78,false );
System.out.println(Conan);
Guerrier Lannister = new Guerrier("Lannister", 45, true);
System.out.println(Lannister);



   ArrayList<Personnage > tabperso = new ArrayList<Personnage>();
   tabperso.add(Gandalf);
   tabperso.add(Garcimore);
   tabperso.add(Conan);
   tabperso.add(Lannister);

System.out.println("la taille du tableau " +tabperso.size());
for (int i=0;i<tabperso.size();i++) {
    System.out.println(tabperso.get(i)); 
} 

ArrayList<Personnage > tableau = new ArrayList<Personnage>();
   tableau.add(Gandalf);
   tableau.add(Garcimore);
   tableau.add(Conan);
   tableau.add(Lannister);

    }
}
