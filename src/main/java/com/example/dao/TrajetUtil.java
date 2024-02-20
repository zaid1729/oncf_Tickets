package com.example.dao;

import java.sql.*;

import com.example.model.Trajet;

public class TrajetUtil {
    Connection con;

    public TrajetUtil() throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oncf", "root", "root");
    }

    public boolean ajouterTrajet(Trajet t) throws SQLException {
        Statement st = con.createStatement();
        String query = "INSERT INTO Trajets (stDepart, stArrivee, heureDepart, heureArrivee, tarif) VALUES ('"
                + t.getStDepart() + "','" + t.getStArrivee() + "','" + t.getHeureDepart() + "','" + t.getHeureArrivee()
                + "','" + t.getTarif() + "');";
        int rs = st.executeUpdate(query);
        return rs > 0;
    }

    public boolean supprimerTrajet(int id) throws SQLException {
        Statement st = con.createStatement();
        String query = "DELETE FROM Trajets WHERE id = " + id + ";";
        int rs = st.executeUpdate(query);
        return rs > 0;
    }

    public boolean modifierStDepart(int id, String d) throws SQLException {
        Statement st = con.createStatement();
        String query = "UPDATE Trajets SET stDepart = '" + d + "' WHERE id = " + id;
        int rs = st.executeUpdate(query);
        return rs > 0;
    }

    public boolean modifierStArrivee(int id, String a) throws SQLException {
        Statement st = con.createStatement();
        String query = "UPDATE Trajets SET stArrivee = '" + a + "' WHERE id = " + id;
        int rs = st.executeUpdate(query);
        return rs > 0;
    }

    public boolean modifierHeureDepart(int id, String h) throws SQLException {
        Statement st = con.createStatement();
        String query = "UPDATE Trajets SET heureDepart = '" + h + "' WHERE id = " + id;
        int rs = st.executeUpdate(query);
        return rs > 0;
    }

    public boolean modifierHeureArrivee(int id, String h) throws SQLException {
        Statement st = con.createStatement();
        String query = "UPDATE Trajets SET heureArrivee = '" + h + "' WHERE id = " + id;
        int rs = st.executeUpdate(query);
        return rs > 0;
    }

    public boolean modifierTarif(int id, String t) throws SQLException {
        Statement st = con.createStatement();
        String query = "UPDATE Trajets SET tarif = '" + t + "' WHERE id = " + id;
        int rs = st.executeUpdate(query);
        return rs > 0;
    }

    public static void main(String[] args) throws SQLException {
        TrajetUtil tu = new TrajetUtil();
        tu.supprimerTrajet(1);
    }
}
