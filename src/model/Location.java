/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author salifu
 */
public class Location {
    private String id;
    private String name;
    
    public Location(String id, String name){
        this.id = id;
        this.name =  name;
    }
    
    public String getid(){
        return id;
    }
    
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }
}

