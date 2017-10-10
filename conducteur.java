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
    private int demarrer = 50;
    private int accelerer = 100;
    private int freiner = 20;
    private int arret = 0;
    
    public void rencontrerFeu(Feu F, Vehicule V) {
    if ( F.getCouleur().equals("Rouge")) {
        V.arreter();
    if ( F.getCouleur().equals("Orange")) {
        V.arreter();
    }
    if ( F.getCouleur().equals("Vert")) {
        V.avancer50();
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

    public int getFreiner() {
        return freiner;
    }

    public void setFreiner(int freiner) {
        this.freiner = freiner;
    }
    
    public int getAccelerer() {
        return accelerer;
    }

    public void setAccelerer(int accelerer) {
        this.accelerer = accelerer;
    }
    
    public void accelerer(Vehicule leVehicule) {
        leVehicule.vitesseplus();
    }
    
    public void accelerer50(Vehicule leVehicule) {
    leVehicule.avancer50();
    }
    
    public void freinermax(Vehicule leVehicule) {
    leVehicule.arreter();
    }

    public void demarrer(Vehicule leVehicule) {
        leVehicule.avancer50();
    }
    
    public int getDemarrer() {
        return demarrer;
    }

    public void setDemarrer(int demarrer) {
        this.demarrer = demarrer;
    }

    public int getArret() {
        return arret;
    }

    public void setArret(int arret) {
        this.arret = arret;
    }

    
    
}
