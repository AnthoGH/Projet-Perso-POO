/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progobject;

import java.util.Scanner;

/**
 *
 * @author Antho
 */
public class ProgObject {
// Programme principal

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
   
        System.out.println("Choisissez le nom de votre conducteur ? ");
        String varchoixC = "";
        Scanner choixC = new Scanner (System.in);
        varchoixC = choixC.nextLine();
        Conducteur C1 = new Conducteur(varchoixC);
        
        System.out.println("Vous êtes le conducteur " + C1.getNomConducteur() );
        
        System.out.println("Pour choisir un véhicule, tappez 'voiture' ou 'moto' : ");
        String varchoix = "";
        Scanner choix = new Scanner(System.in);
        
        Voiture Voiture = new Voiture("Fiat","500X","Diesel");
        Moto Moto = new Moto("Kawasaki","Ninja","Essence");
        
        varchoix = choix.nextLine();
        if ("voiture".equals(varchoix)){
            System.out.println(Voiture.uneVoiture());
        }
        else if ("moto".equals(varchoix)){
        System.out.println(Moto.uneMoto());
        }else{
            System.out.println("Je ne connais pas ce véhicule");
        }
        
        System.out.println("Votre conducteur démarre, le véhicule roule à " + C1.getDemarrer() + "Km/h");
        System.out.println("Voulez vous accelerer, freiner ou vous arreter ? Tappez 1, 2 ou 3");
        String varchoix2 = "";
        Scanner choix2 = new Scanner(System.in);
        
         varchoix2 = choix2.nextLine();
         if ("1".equals(varchoix2)){
         System.out.println("Votre conducteur accelère, vous roulez maintenant à " + C1.getAccelerer() + " Km/h");
        }
          else if ("2".equals(varchoix2)){
        System.out.println("Votre conducteur freine, vous roulez maintenant à " + C1.getFreiner() + " Km/h");
        }
          else if ("3".equals(varchoix2)){
        System.out.println("Votre conducteur s'arrete, vous roulez maintenant à " + C1.getArret() + " Km/h");
          }else{
            System.out.println("Action inconnue");
        }
         
        System.out.println("C'est la fin de ce programme pour le projet perso POO. ");
        System.out.println("Prochainement, si ce projet est continué, le conducteur pourra interagir avec les feux tricolores, classes et méthodes sont déja créer.");
    }
    
    
}
