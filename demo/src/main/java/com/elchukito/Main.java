package com.elchukito;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String user = "info24_RAFAEL";
        String pass = "info24_RAFAEL";
        String nameBank = "info24_RAFAEL";
        Integer port = 3306;
        String host = "//wagnerweinert.com.br:";
        // String url = "jdbc:mysql://host:port/nameBank?user=user?password=pass"
        String url = "jdbc:mysql:" + host + port + "/" + nameBank + "?user=" + user + "?password=" + pass;

        try {
            Connection connection = DriverManager.getConnection(url);
            String query = "SELECT * FROM vet_ex_pet";
            PreparedStatement stmt = connection.prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while(rs.next()) {
                String namePet = rs.getString("nome_pet_vet_ex");

                System.out.println("Nome do pet: " + namePet);
            }

        } catch(SQLException e) {
            System.out.println(e.getMessage());
            return ;
        }
    }
}