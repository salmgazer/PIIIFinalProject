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
public class Meeting {
    
    private final String id;
    private enum kind{academic, personal};
    kind thekind;
    String attend;
    
    public Meeting(String id, String k, String attend){
        this.id = id; 
        setkind(k); 
        this.attend = attend;
    }
    
    //id
    public String getid(){
        return id;
    }
    
    //kind
    public void setkind(String k){
        switch(k){
            case "academic": thekind = kind.academic;
                break;
            case "personal": thekind = kind.personal;
                break;
        }
    }
    public kind getkind(){
        return thekind;
    }
    
    //date_attended
    public void setattend(String attend){
        this.attend = attend;
    }
    public String getattend(){
        return attend;
    }
    
}
