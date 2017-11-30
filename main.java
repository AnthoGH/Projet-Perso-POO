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
        
        do {
            varchoix = choix.nextLine();
            if ("voiture".equals(varchoix)){
                C1.setUnVehicule(Voiture);
                System.out.println(Voiture.uneVoiture());
            }
            else if ("moto".equals(varchoix)){
                C1.setUnVehicule(Moto);
                System.out.println(Moto.uneMoto());
            }else{
                System.out.println("Je ne connais pas ce véhicule");
                System.out.println("Pour choisir un véhicule, tappez 'voiture' ou 'moto' : ");
            }
        }while(!"voiture".equals(varchoix) && !"moto".equals(varchoix));
        
        System.out.println("Votre conducteur démarre automatiquement, le véhicule roule à " + C1.demarrer() + " Km/h");
        System.out.println("Voulez vous accelerer, freiner, vous arreter, ou stopper la simulation ? Tappez 1, 2, 3 ou 4");
        String varchoix2 = "";
        Scanner choix2 = new Scanner(System.in);
        
        
        do {
         varchoix2 = choix2.nextLine();
         
         if ("1".equals(varchoix2)){
            C1.accelerer();
            System.out.println("Votre conducteur accelère, vous roulez maintenant à " + C1.getUnVehicule().getVitesse() + " Km/h");
            System.out.println("Voulez vous accelerer, freiner, vous arreter, ou stopper la simulation ? Tappez 1, 2, 3 ou 4");
        }
          else if ("2".equals(varchoix2)){
            C1.freiner();
            System.out.println("Votre conducteur freine, vous roulez maintenant à " + C1.getUnVehicule().getVitesse() + " Km/h");
            System.out.println("Voulez vous accelerer, freiner, vous arreter, ou stopper la simulation ? Tappez 1, 2, 3 ou 4");
        }
          else if ("3".equals(varchoix2)){
            C1.arret();
            System.out.println("Votre conducteur s'arrete, vous roulez maintenant à " + C1.getUnVehicule().getVitesse() + " Km/h");
            System.out.println("Voulez vous accelerer, freiner, vous arreter, ou stopper la simulation ? Tappez 1, 2, 3 ou 4");
          }
          else if ("4".equals(varchoix2)){
            System.out.println("C'est la fin de ce programme pour le projet perso POO. ");
            System.out.println("Vous avez choisit le conducteur : " + C1.getNomConducteur() );
            System.out.println("Vous avez choisit le vehicule : " + C1.getUnVehicule().getNomVehicule() + " " + C1.getUnVehicule().getModelVehicule() );
            System.out.println("Votre vitesse finale était de :" + C1.getUnVehicule().getVitesse() + " Km/h");
        }else{
            System.out.println("Action inconnue, réessayer");
            System.out.println("Voulez vous accelerer, freiner, vous arreter, ou stopper la simulation ? Tappez 1, 2, 3 ou 4");
        }
        }while(!"4".equals(varchoix2));
    }
    
    
}
