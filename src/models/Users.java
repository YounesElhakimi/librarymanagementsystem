/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author PC
 */
public class Users {
    
    int idUser;
    String prenom , nom , numTel  ;
    byte[] image;
    Boolean isResid;

    public Users(int idUser, String prenom, String nom, String numTel, byte[] image, Boolean isResid) {
        this.idUser = idUser;
        this.prenom = prenom;
        this.nom = nom;
        this.numTel = numTel;
        this.image = image;
        this.isResid = isResid;
    }
    
    public Users(int idUser, String prenom, String nom, String numTel,  Boolean isResid) {
        this.idUser = idUser;
        this.prenom = prenom;
        this.nom = nom;
        this.numTel = numTel;
        this.image = image;
        this.isResid = isResid;
    }

    public Users( String prenom, String nom, String numTel, Boolean isResid) {
        this.prenom = prenom;
        this.nom = nom;
        this.numTel = numTel;
        this.isResid = isResid;
    }
    
    
    

    public Users() {
   
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
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

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Boolean getIsResid() {
        return isResid;
    }

    public void setIsResid(Boolean isResid) {
        this.isResid = isResid;
    }

    @Override
    public String toString() {
        return "Users{" + "idUser=" + idUser + ", prenom=" + prenom + ", nom=" + nom + ", numTel=" + numTel + ", image=" + image + ", isResid=" + isResid + '}';
    }
    
    
    
  
}
