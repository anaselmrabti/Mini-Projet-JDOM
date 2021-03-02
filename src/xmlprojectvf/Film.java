/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlprojectvf;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anase
 */
public class Film {
    private String titre;
    private String genre;
    private String pays;
    private int annee;
    private int mes;
    public ArrayList<role> roles;
    private String resume;


    public Film(String titre, String genre, String pays, int annee, int mes, String resume) {
        this.titre = titre;
        this.genre = genre;
        this.pays = pays;
        this.annee = annee;
        this.mes = mes;
        this.roles = new ArrayList<role>();
        this.resume = resume;
    }

    public Film(String titre, String genre, String pays, int annee, int mes, ArrayList<role> roles, String resume) {
        this.titre = titre;
        this.genre = genre;
        this.pays = pays;
        this.annee = annee;
        this.mes = mes;
        this.roles = roles;
        this.resume = resume;
    }

    
    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }



    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getTitre() {
        return titre;
    }

    public String getGenre() {
        return genre;
    }

    public int getAnnee() {
        return annee;
    }

    public ArrayList<role> getRoles() {
        return roles;
    }

    public String getResume() {
        return resume;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public void setRoles(ArrayList<role> roles) {
        this.roles = roles;
    }
    public void addRole(role r){
        this.roles.add(r);
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    
    @Override
    public String toString() {
        return "Filme{" + "titre=" + titre + ", genre=" + genre + ", pays=" + pays + ", annee=" + annee + ", roles=" + roles + ", resume=" + resume + '}';
    }

    
}
