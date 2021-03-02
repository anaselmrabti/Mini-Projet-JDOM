/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlprojectvf;

/**
 *
 * @author anase
 */
public class role {
    private String nom;
    private String prenom;
    private String intitule;

    public role(String nom, String prenom, String intitule) {
        this.nom = nom;
        this.prenom = prenom;
        this.intitule = intitule;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getIntitule() {
        return intitule;
    }

    @Override
    public String toString() {
        return "role{" + "nom=" + nom + ", prenom=" + prenom + ", intitule=" + intitule + '}';
    }
    
}
