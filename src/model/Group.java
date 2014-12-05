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
public class Group {
    
    private String id;
    private String name;
    private enum type{academic, other};
    type thetype;
    private int size;
    private String date_formed;
    private String date_closed;
    private String picture;
    
    public Group(String id, String thetype, int size, String date_formed, String date_Closed, String picture){
        this.id = id;
        settype(thetype);
        this.size = size;
        this.date_formed = date_formed;
        this.date_closed = date_Closed;
        this.picture = picture;
    }
    
    //id
    public String getid(String id){
        return id;
    }
    
    //type
    public void settype(String t){
        switch(t){
            case "academic": thetype = type.academic;
               break;
            case "other": thetype = type.other;
                break;
        }
    }
    public type gettype(){
        return thetype;
    }
    
    //name
    public void setname(String name){
        this.name = name;
    }
    public String getname(){
        return name;
    }
    
    //size
    public void setsize(int size){
        this.size = size;
    }
    public int getsize(){
        return size;
    }
    
    //date_formed  //setting date is done within constructor
    public String getformed(){
        return date_formed;
    }
    
    //date_closed
    public void setclosed(String date_closed){
        this.date_closed = date_closed;
    }
    public String getclosed(){
        return date_closed;
    }
    
    //picture
    public void setpicture(String picture){
        this.picture = picture;
    }
    public String getpicture(){
        return picture;
    }
    
}
