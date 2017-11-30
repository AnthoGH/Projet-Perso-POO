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
   private String nomVehicule;
   private String modelVehicule;
   private String ressource;
   private int vitesse = 50;
   
   public Vehicule (String nomVehicule, String modelVehicule, String ressource) {
       this.nomVehicule = nomVehicule;
       this.modelVehicule = modelVehicule;
       this.ressource = ressource;
   }
   
   
   
    public String getRessource() {
        return ressource;
    }

    public void setRessource(String ressource) {
        this.ressource = ressource;
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

    public String getNomVehicule() {
        return nomVehicule;
    }

    public String getModelVehicule() {
        return modelVehicule;
    }
    
    public String unVehicule(){
        return "Votre véhicule est une " +this.nomVehicule + " " +this.modelVehicule+" "+this.ressource + ".";
                }
}



