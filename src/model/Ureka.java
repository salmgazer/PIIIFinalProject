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
public class Ureka {
    
    private final String id;
    private String author;
    private String thought;
    private String inspiration;
    private final String date_added;
    
    public Ureka(String id, String author, String thought, String inspiration, String date_added){
        this.id = id;
        this.author = author;
        this.thought =  thought;
        this.inspiration = inspiration;
        this.date_added = date_added;
    }
    
    //id
    public String getid(){
        return id;
    }
    
    //thought
    public void setthought(String thought){
        this.thought = thought;
    }
    public String getthought(){
        return thought;
    }
    
    //date_Added
    public String getadded(){
        return date_added;
    }
    
    //Author
    public void setauthor(String author){
        this.author = author;
    }
    public String getauthor(){
        return author;
    }
    
    //inspiration
    public String getinspiration(){
        return inspiration;
    }
    public void setinspiration(String inspiration){
        this.inspiration = inspiration;
    }
    
}
