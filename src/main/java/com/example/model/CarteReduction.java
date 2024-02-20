package com.example.model;

public class CarteReduction {
    private int id;
    private String type;
    private int tauxReduction;

    public CarteReduction(String type, int tauxReduction) {
        this.type = type;
        this.tauxReduction = tauxReduction;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTauxReduction() {
        return tauxReduction;
    }

    public void setTauxReduction(int tauxReduction) {
        this.tauxReduction = tauxReduction;
    }

    @Override
    public String toString() {
        return "CarteReduction [id=" + id + ", type=" + type + ", tauxReduction=" + tauxReduction + "]";
    }

}
