/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1_convertisseur_larnac;

/**
 *
 * @author Anaëlle
 */
public class Convert {
     public static double CelciusVersKelvin (double tCelcius) {
        tCelcius=tCelcius+273;//calcul de la conversion
        return tCelcius;//retourner le résultat de la conversion
    }
    public static double KelvinVersCelcius(double tKelvin){
        tKelvin=tKelvin-273;
        return tKelvin;
    }
    public static double FahrenheitVersCelcius(double tFahr){
        tFahr=(tFahr-32)/1.8;
        return tFahr;
    }
    public static double CelciusVersFahrenheit (double tCelcius){
        tCelcius=(tCelcius*1.8)+32;
        return tCelcius;
    }
    public static double FahrenheitVersKelvin (double tFahr){
        tFahr=(tFahr+459.67)*(5/9);
        return tFahr;
    }
    public static double KelvinVersFahrenheit (double tKelvin){
        tKelvin=(tKelvin*(9/5))-459.67;
        return tKelvin;
    }
}

