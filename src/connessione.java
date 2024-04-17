/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nicoa
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class connessione {

    public static final String Driver = "org.apache.derby.jdbc.AutoloadedDriver";
    public static final String Jdbc = "jdbc:derby:Quizz;create=true";
    
    
    //metodo per creare la tabella quiz_storia
    public static void CreaTabQuizStoria() throws SQLException, ClassNotFoundException {
        try {
            Class.forName(Driver);
            Connection c = (Connection) DriverManager.getConnection(Jdbc);

            c.createStatement().execute("CREATE TABLE quiz_storia (domanda VARCHAR(150), risposta_corretta VARCHAR(150), risposta_sbagliata1 VARCHAR(150), risposta_sbagliata2 VARCHAR(150), risposta_sbagliata3 VARCHAR(150))");

        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }

    }
    
        //metodo per creare la tabella quiz_geo
    public static void CreaTabQuizGeo() throws SQLException, ClassNotFoundException {
        try {
            Class.forName(Driver);
            Connection c = (Connection) DriverManager.getConnection(Jdbc);

            c.createStatement().execute("CREATE TABLE quiz_geo (domanda VARCHAR(150), risposta_corretta VARCHAR(150), risposta_sbagliata1 VARCHAR(150), risposta_sbagliata2 VARCHAR(150), risposta_sbagliata3 VARCHAR(150))");

        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }

    }
    
        //metodo per creare la tabella quiz_cinema
    public static void CreaTabQuizCinema() throws SQLException, ClassNotFoundException {
        try {
            Class.forName(Driver);
            Connection c = (Connection) DriverManager.getConnection(Jdbc);

            c.createStatement().execute("CREATE TABLE quiz_cinema (domanda VARCHAR(150), risposta_corretta VARCHAR(150), risposta_sbagliata1 VARCHAR(150), risposta_sbagliata2 VARCHAR(150), risposta_sbagliata3 VARCHAR(150))");

        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }

    }
    
        //metodo per creare la tabella quiz_sport
    public static void CreaTabQuizSport() throws SQLException, ClassNotFoundException {
        try {
            Class.forName(Driver);
            Connection c = (Connection) DriverManager.getConnection(Jdbc);

            c.createStatement().execute("CREATE TABLE quiz_sport (domanda VARCHAR(150), risposta_corretta VARCHAR(150), risposta_sbagliata1 VARCHAR(150), risposta_sbagliata2 VARCHAR(150), risposta_sbagliata3 VARCHAR(150))");

        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }

    }
    
    //metodi per capire se una tabella esiste o meno
    public static boolean SeTabQuizStoriaEsiste() throws ClassNotFoundException, SQLException {
        try {

            Class.forName(Driver);
            Connection c = DriverManager.getConnection(Jdbc);
            ResultSet resultSet = c.getMetaData().getTables(null, null, "QUIZ_STORIA", null);
            return resultSet.next();
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public static boolean SeTabQuizGeoEsiste() throws ClassNotFoundException, SQLException {
        try {

            Class.forName(Driver);
            Connection c = DriverManager.getConnection(Jdbc);
            ResultSet resultSet = c.getMetaData().getTables(null, null, "QUIZ_GEO", null);
            return resultSet.next();
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public static boolean SeTabQuizCinemaEsiste() throws ClassNotFoundException, SQLException {
        try {

            Class.forName(Driver);
            Connection c = DriverManager.getConnection(Jdbc);
            ResultSet resultSet = c.getMetaData().getTables(null, null, "QUIZ_CINEMA", null);
            return resultSet.next();
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public static boolean SeTabQuizSportEsiste() throws ClassNotFoundException, SQLException {
        try {

            Class.forName(Driver);
            Connection c = DriverManager.getConnection(Jdbc);
            ResultSet resultSet = c.getMetaData().getTables(null, null, "QUIZ_SPORT", null);
            return resultSet.next();
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

  

}
