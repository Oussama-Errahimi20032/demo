/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demos;

/**
 *
 * @author oussama
 */
public class Site {
    int id;
    String nom;
    
public Site(){
    
}
public Site(String nom){
    this.nom=nom;
}

public int getId(){
    return id;
}

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setId(int id){
        this.id=id;
    }


    
}
