package com.example.dao;

import java.sql.*;
import java.util.LinkedList;


import com.example.model.Voyageur;

public class VoyageurUtil {
    Connection con;

    public VoyageurUtil() throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oncf", "root", "root");
    }

    public LinkedList<Voyageur> rechercherParID(int id) throws SQLException {
        LinkedList<Voyageur> trajets = new LinkedList<>();
        Statement st = con.createStatement();
        String query = "SELECT * FROM voyageurs WHERE id = " + id + "";
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            Voyageur t = new Voyageur(rs.getInt("id"),rs.getString("nom"), rs.getString("prenom"), rs.getString("email"),
                    rs.getInt("carteReductionId"));
            trajets.add(t);
        }
        return trajets;
    }

    public LinkedList<Voyageur> showAll() throws SQLException {
        LinkedList<Voyageur> trajets = new LinkedList<>();
        Statement st = con.createStatement();
        String query = "select * from voyageurs";
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            Voyageur t = new Voyageur(rs.getInt("id"),rs.getString("nom"), rs.getString("prenom"), rs.getString("email"),
                    rs.getInt("carteReductionId"));
            trajets.add(t);
        }
        return trajets;
    }
}
