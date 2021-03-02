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
public class Artiste {
    private int id;
    private String nom;
    private String prenom;
    private String anneeNaissance;

    public Artiste(int id, String nom, String prenom, String anneeNaissance) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.anneeNaissance = anneeNaissance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAnneeNaissance(String anneeNaissance) {
        this.anneeNaissance = anneeNaissance;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAnneeNaissance() {
        return anneeNaissance;
    }

    @Override
    public String toString() {
        return "Artiste{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", anneeNaissance=" + anneeNaissance + '}';
    }
    
}
