package com.example.model;

public class Trajet {

    private int id;
    private String stDepart;
    private String stArrivee;
    private String heureDepart;
    private String heureArrivee;
    private int tarif;

    public Trajet(String stDepart, String stArrivee, String heureDepart, String heureArrivee, int tarif) {
        this.stDepart = stDepart;
        this.stArrivee = stArrivee;
        this.heureDepart = heureDepart;
        this.heureArrivee = heureArrivee;
        this.tarif = tarif;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getTarif() {
        return tarif;
    }

    public void setTarif(int tarif) {
        this.tarif = tarif;
    }

    @Override
    public String toString() {
        return "Trajet [id=" + id + ", stDepart=" + stDepart + ", stArrivee=" + stArrivee + ", heureDepart="
                + heureDepart + ", heureArrivee=" + heureArrivee + ", tarif=" + tarif + "]";
    }

}
