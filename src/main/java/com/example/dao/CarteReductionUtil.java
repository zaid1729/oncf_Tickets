package com.example.dao;

import java.sql.*;

import com.example.model.CarteReduction;

public class CarteReductionUtil {
    Connection con;

    public CarteReductionUtil() throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oncf", "root", "root");
    }

    public boolean ajouterCarteReduction(CarteReduction c) throws SQLException {
        Statement st = con.createStatement();
        String query = "INSERT INTO CartesReduction (type, tauxReduction) VALUES ('"+c.getType()+"','"+c.getTauxReduction()+"');";
        int rs = st.executeUpdate(query);
        return rs>0;
    }
    public boolean modifierTauxReduction(String type,int tx) throws SQLException {
        Statement st = con.createStatement();
        String query = "UPDATE Cartesreduction SET tauxReduction = '" + tx + "' WHERE type = '" + type + "';";
        int rs = st.executeUpdate(query);
        return rs>0;
    }
    public boolean supprimerCarteReduction(int id) throws SQLException {
        Statement st = con.createStatement();
        String query = "DELETE FROM CartesReduction WHERE id ="+id+";";
        int rs = st.executeUpdate(query);
        return rs>0;
    }
    public boolean associerCarteReduction(int idV,int idC) throws SQLException {
        Statement st = con.createStatement();
        String query = "UPDATE Voyageurs SET carteReductionId = "+idC+"WHERE id ="+idV+";";
        int rs = st.executeUpdate(query);
        return rs>0;
    }
}
