package com.example.model;

public class Billet {
    private int id;
    private String stDepart;
    private String stArrivee;
    private String heureDepart;
    private String heureArrivee;
    private int Classe;
    private int prix;
    public Billet(String stDepart, String stArrivee, String heureDepart, String heureArrivee, int classe, int prix) {
        this.stDepart = stDepart;
        this.stArrivee = stArrivee;
        this.heureDepart = heureDepart;
        this.heureArrivee = heureArrivee;
        Classe = classe;
        this.prix = prix;
    }
    public String getStDepart() {
        return stDepart;
    }
    public void setStDepart(String stDepart) {
        this.stDepart = stDepart;
    }
    public String getStArrivee() {
        return stArrivee;
    }
    public void setStArrivee(String stArrivee) {
        this.stArrivee = stArrivee;
    }
    public String getHeureDepart() {
        return heureDepart;
    }
    public void setHeureDepart(String heureDepart) {
        this.heureDepart = heureDepart;
    }
    public String getHeureArrivee() {
        return heureArrivee;
    }
    public void setHeureArrivee(String heureArrivee) {
        this.heureArrivee = heureArrivee;
    }
    public int getClasse() {
        return Classe;
    }
    public void setClasse(int classe) {
        Classe = classe;
    }
    public int getPrix() {
        return prix;
    }
    public void setPrix(int prix) {
        this.prix = prix;
    }
    
    
    
}
