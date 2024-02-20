package com.example.dao;

import java.sql.*;
import java.util.LinkedList;

import com.example.model.Trajet;

public class RapportUtil {
    Connection con;

    public RapportUtil() throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oncf", "root", "root");
    }

    public LinkedList<Trajet> rechercherParID(int id) throws SQLException {
        LinkedList<Trajet> trajets = new LinkedList<>();
        Statement st = con.createStatement();
        String query = "SELECT * FROM trajets WHERE id = " + id + "";
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            Trajet t = new Trajet(rs.getString("stDepart"), rs.getString("stArrivee"), rs.getString("heureDepart"),
                    rs.getString("heureArrivee"), rs.getInt("tarif"));
            trajets.add(t);
        }
        return trajets;
    }

    public LinkedList<Trajet> showAll() throws SQLException {
        LinkedList<Trajet> trajets = new LinkedList<>();
        Statement st = con.createStatement();
        String query = "select * from trajets";
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            Trajet t = new Trajet(rs.getString("stDepart"), rs.getString("stArrivee"), rs.getString("heureDepart"),
                    rs.getString("heureArrivee"), rs.getInt("tarif"));
            trajets.add(t);
        }
        return trajets;
    }
}
