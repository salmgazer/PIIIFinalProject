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
    
    private String id;
    private String author;
    private String thought;
    private String inspiration;
    
    public Ureka(String id, String author, String thought, String inspiration){
        this.id = id;
        this.author = author;
        this.thought =  thought;
        this.inspiration = inspiration;
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
