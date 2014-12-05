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
public class Task {
    private enum kind{personal,group};
    kind thekind;
    private final String id;
    private String description;
    private String fulltask;
    private final String date_added;
    private String date_to_finish;
    private String start_date;
    private String date_finished;
    private int progress;
    private String picture;
    private enum task_type{personal, group};
    task_type thetype;
    
    
    public  Task(String id, String thekind, String desc, String full, String added, String to_finish,
            String start, String picture, String task_type){
        this.id = id; setkind(thekind); description = desc; fulltask = full; date_added = added; 
        date_to_finish = to_finish; start_date = start; this.picture = picture; settask(task_type);    
    }
    
    //ID
    public String getid(){
        return id;
    }
    
    //Task kind
    public void setkind(String k){
        switch(k){
            case "personal": thekind = kind.personal;
                break;
            case "group": thekind = kind.group;
                break;
        }
    }
    public kind getkind(){
        return thekind;
    }
    
    //Task type
    private void settype(String t){
        switch(t){
            case "personal": thetype = task_type.personal;
                break;
            case "group": thetype = task_type.personal;
                break;
        }
    }
    public task_type gettype(){
        return thetype;
    }
    
    //Description
    public void setdesc(String desc){
        description = desc;
    }
    public String getdesc(){
        return description;
    }
    
    //full task
    public void settask(String task){
        fulltask = task;
    }
    public String getTask(){
        return fulltask;
    }
    
    //Date added
    public String getadded(){
        return date_added;
    }
    
    //Date to finish
    public void setfinish(String tofinish){
        date_to_finish = tofinish;
    }
    public String tofinish(){
        return date_to_finish;
    }
    
    //finish date
    public void setFinished(String finished){
        date_to_finish =  finished;
    }
    public String getFinished(){
        return date_finished;
    }
    
    //Start date
    public void setstart(String st){
        start_date = st;
    }
    public String getstart(){
        return start_date;
    }
    
    //Progress
    public void setProgress(int p){
        progress = p;
    }
    public int getProgress(){
        return progress;
    }
    
    //picture
    public void setpicture(String p){
        picture = p;
    }
    public String getpicture(){
        return picture;
    }
    
}
