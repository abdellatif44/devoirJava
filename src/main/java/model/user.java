/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HP
 */
public class user {
    private int id;
    private String prenom;
    private String nom;
    private String password;
    private String profile;
    private String login;

// Creer un constructeur sans arguments
public user (){
    
}
// Creer un constructeur avec arguments
   public user(int id, String prenom, String nom, String login, String password, String profile) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.login = login;
        this.password = password;
        this.profile = profile;
    }
   
// Creer les getter et setter de tous les champs
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getPrenom() {
        return prenom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public String getLogin() {
        return login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getProfile() {
        return profile;
    }
    
    public void setProfile(String profile) {
        this.profile = profile;
    }
}

