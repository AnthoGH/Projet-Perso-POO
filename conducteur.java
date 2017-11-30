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
public class Conducteur {
    private String nomConducteur;
    private Vehicule unVehicule;
    
    public void rencontrer(Feu F) {
    if ( F.getCouleur().equals("Rouge")) {
        arret();
    if ( F.getCouleur().equals("Orange")) {
        arret();
    }
    if ( F.getCouleur().equals("Vert")) {
        demarrer();
    }
                              
   }}
    
    //Constructeur
    public Conducteur(String nomConducteur){
        this.nomConducteur = nomConducteur;
    }

    public String getNomConducteur() {
        return nomConducteur;
    }

    public void setNomConducteur(String nomConducteur) {
        this.nomConducteur = nomConducteur;
    }

    public int demarrer() {
        return unVehicule.getVitesse();
    }
    
     public void accelerer() {
         unVehicule.setVitesse(unVehicule.getVitesse()+20);
    }
     
     public void freiner() {
         unVehicule.setVitesse(unVehicule.getVitesse()-20);
     }
     
     public void arret () {
         unVehicule.setVitesse(0);
     }

    public Vehicule getUnVehicule() {
        return unVehicule;
    }

    public void setUnVehicule(Vehicule unVehicule) {
        this.unVehicule = unVehicule;
    }
    
}
