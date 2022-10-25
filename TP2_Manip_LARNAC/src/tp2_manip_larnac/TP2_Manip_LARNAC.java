/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_larnac;

/**
 *
 * @author Anaëlle
 */
public class TP2_Manip_LARNAC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //attribue le nombre de calories à chaque assiette de tartiflette
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        Tartiflette assiette3 = assiette2 ; //remplacement de l'assiette 2 par l'assiette 3
        
        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories) ;
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
        //l'assiette 3 a remplacé l'assiette 2
        //Moussaka assiette666 = assiette1 ;
        //Moussaka assiette667 = new Tartiflette() ;
        //Non, on peut pas il faut qu'il y ait le même nom
        Moussaka [] tab = new Moussaka [10]; //création d'un tableau avec 10 valeurs de calories de moussaka
        for(int i=0;i<10;i++){
            tab[i]=new Moussaka (i);
        }
    }
    
}
