package com.example.model;

public class Voyageur {
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private int idReduction;
  
    public Voyageur( int id, String nom, String prenom, String email, int idReduction) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.idReduction = idReduction;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getIdReduction() {
        return idReduction;
    }
    public void setIdReduction(int idReduction) {
        this.idReduction = idReduction;
    }
    @Override
    public String toString() {
        return "Voyageur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", carteReduction="
                + idReduction + "]";
    }

    
}
