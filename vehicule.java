/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progobject;

/**
 *
 * @author Antho
 */
public class Vehicule {
   protected String nomVehicule;
   protected String modelVehicule;
   protected String ressource;
   private int nbrRoue;
   private int nbrSiege;
   private int vitesse = 50;
   private int vitessepointe;
   
   public Vehicule (String nomVehicule, String modelVehicule, String ressource) {
       this.nomVehicule = nomVehicule;
       this.modelVehicule = modelVehicule;
       this.ressource = ressource;
   }
   

    public int getVitessepointe() {
        return vitessepointe;
    }

    public String getRessource() {
        return ressource;
    }

    public int getNbrRoue() {
        return nbrRoue;
    }

    public void setNbrRoue(int nbrRoue) {
        this.nbrRoue = nbrRoue;
    }

    public void setRessource(String ressource) {
        this.ressource = ressource;
    }

    public void setVitessepointe(int vitessepointe) {
        this.vitessepointe = vitessepointe;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }
    
    public void setNomVehicule(String nomVehicule) {
        this.nomVehicule = nomVehicule;
    }

    public void setModelVehicule(String modelVehicule) {
        this.modelVehicule = modelVehicule;
    }

    public void setNbrSiege(int nbrSiege) {
        this.nbrSiege = nbrSiege;
    }

    public String getNomVehicule() {
        return nomVehicule;
    }

    public String getModelVehicule() {
        return modelVehicule;
    }

    public int getNbrSiege() {
        return nbrSiege;
    }
    
    public void vitesseplus() {
    vitesse++;
    }
    
    public void avancer50() {
    vitesse=50;
    }
    
    public void arreter() {
    vitesse=0;
    }
    
    public String unVehicule(){
        return "\t"+"Votre véhicule est une " +this.nomVehicule + " " +this.modelVehicule+" "+this.ressource + ".";
                }
}



