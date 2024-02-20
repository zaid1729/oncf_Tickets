package com.example.dao;

import java.sql.*;

import com.example.model.Billet;

public class BilletUtil {
    Connection con;

    public BilletUtil() throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oncf", "root", "root");
    }

    public boolean existeTicket(String stDp, String stArr, String heureDp, String heureDa) throws SQLException {
        Statement st = con.createStatement();
        String query = "select * from trajets";
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            if (rs.getString("stDepart").equals(stDp) && rs.getString("stArrivee").equals(stArr)
                    && rs.getString("heureDepart").equals(heureDp) && rs.getString("heureArrivee").equals(heureDa)) {
                System.out.println("yes");
                return true;
            }
        }
        return false;
    }

    public Billet getTicket(String stDp, String stArr, String heureDp, String heureDa, int classe) throws SQLException {
        Statement st = con.createStatement();
        String query = "select * from trajets";
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            if (rs.getString("stDepart").equals(stDp) && rs.getString("stArrivee").equals(stArr)
                    && rs.getString("heureDepart").equals(heureDp) && rs.getString("heureArrivee").equals(heureDa)) {
                System.out.println("yes");
                Billet b = new Billet(rs.getString("stDepart"), rs.getString("stArrivee"), rs.getString("heureDepart"),
                        rs.getString("heureArrivee"), classe, rs.getInt("tarif"));
                return b;
            }
        }
        return null;
    }

    public boolean addTicket(Billet t) throws SQLException {
        Statement st = con.createStatement();
        String query = "INSERT INTO Billets (stDepart, stArrivee, heureDepart, heureArrivee, Classe,prix) VALUES ('"
                + t.getStDepart() + "','" + t.getStArrivee() + "','" + t.getHeureDepart() + "','" + t.getHeureArrivee()
                + "'," + t.getClasse() + "," + t.getPrix() + ");";
        int rs = st.executeUpdate(query);
        return rs > 0;
    }

}
