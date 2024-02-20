package com.example.model;

public class Rapport {
    private String periode;
    private int ventes;
    private int revenu;
    public Rapport(String periode, int ventes, int revenu) {
        this.periode = periode;
        this.ventes = ventes;
        this.revenu = revenu;
    }
    public String getPeriode() {
        return periode;
    }
    public void setPeriode(String periode) {
        this.periode = periode;
    }
    public int getVentes() {
        return ventes;
    }
    public void setVentes(int ventes) {
        this.ventes = ventes;
    }
    public int getRevenu() {
        return revenu;
    }
    public void setRevenu(int revenu) {
        this.revenu = revenu;
    }
    @Override
    public String toString() {
        return "Rapport [periode=" + periode + ", ventes=" + ventes + ", revenu=" + revenu + "]";
    }

    
}
