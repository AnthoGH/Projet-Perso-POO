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
public class Voiture extends Vehicule {
    private String rouler;

    //Constructeur
    public Voiture(String nomVehicule, String modelVehicule, String ressource) {
        super(nomVehicule, modelVehicule, ressource);
        rouler = "appuyer sur la pédale d'accélerateur"; 
    }
    //Fin Constructeur

    public Voiture(String rouler, String nomVehicule, String modelVehicule, String ressource) {
        super(nomVehicule, modelVehicule, ressource);
        this.rouler = rouler;
    }

    public String getRouler() {
        return rouler;
    }

    public void setRouler(String rouler) {
        this.rouler = rouler;
    }
    
    public String uneVoiture(){
        String str = super.unVehicule()+ " C'est une voiture, il faut donc "+this.rouler+" pour avancer !";
        return str;
    }
   
}
