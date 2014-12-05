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
public class Goal {
    
    private String id;
    private enum kind{group, personal};
    kind thekind;
    String goal;
    String date_entered;
    String date_to_finish;
    int activity;
    
    public Goal(String id, String k, String goal, String  date_entered, String date_to_finish){
        this.id = id;
        setkind(k);
        this.goal = goal;
        this.date_entered = date_entered;
        this.date_to_finish = date_to_finish;
        activity = 0;
    }
    
    //kind
    public  void setkind(String k){
        switch(k){
            case "group": thekind = kind.group;
                break;
            case "personal": thekind = kind.personal;
                break;
        }
    }
    public kind getkind(){
        return thekind;
    }
    
    //id
    public String getid(){
        return id;
    }
    
    //goal
    public String getgoal(){
        return goal;
    }
    public void setgoal(String g){
        goal = g;
    }
    
    //date_enetred
    public void entered(String d){
        date_entered = d;
    }
    public String getentered(){
        return date_entered;
    }
    
    //date_to_finish
    public void tofinish(String f){
        date_to_finish = f;
    }
    public String gettofinish(){
        return date_to_finish;
    }
    
    //activity
    public void setactivity(int a){
        activity = a;
    }
    public int getactivity(){
        return activity;
    }
}
