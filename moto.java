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
public class Moto extends Vehicule {
    private String rouler;

    //Constructeur
    public Moto(String nomVehicule, String modelVehicule, String ressource) {
        super(nomVehicule, modelVehicule, ressource);
        rouler = "tourner le guidon"; 
    }
    //Fin Constructeur

    public Moto(String rouler, String nomVehicule, String modelVehicule, String ressource) {
        super(nomVehicule, modelVehicule, ressource);
        this.rouler = rouler;
    }

    public String getRouler() {
        return rouler;
    }

    public void setRouler(String rouler) {
        this.rouler = rouler;
    }
    
    public String uneMoto(){
        String str = super.unVehicule()+ " C'est une moto, il faut donc "+this.rouler+" pour avancer !";
        return str;
    }
   
}
