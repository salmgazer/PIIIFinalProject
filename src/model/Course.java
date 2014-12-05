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
public class Course {
    
    private String id;
    private String name;
    private enum student_year{freshman, sophomore, junior, senior};
    student_year stuyear;
    private String theyear;
    private String tutor;
    private String fi;
    private String picture;
    
    public Course(){
        
    }
    
    //student_year
    public void setstuyear(String s){
        switch(s){
            case "freshman": stuyear = student_year.freshman;
                break;
            case "sophomore": stuyear = student_year.sophomore;
                break;
            case "junior": stuyear = student_year.junior;
                break;
            case "senior": stuyear = student_year.senior;
                break;
        }
    }
    public student_year getstuyear(){
        return stuyear;
    }
    
    //id
    public String getid(){
        return id;
    }
    
    //name
    public void setname(String name){
        this.name = name;
    }
    public String getname(){
        return name;
    }
    
    //theyear
    public void setyear(String theyear){
        this.theyear = theyear;
    }
    public String getyear(){
        return theyear;
    }
    
    //tutor
    public void settutor(String tutor){
        this.tutor = tutor;
    }
    public String gettutor(){
        return tutor;
    }
    
    //fi
    public void setfi(String fi){
        this.fi = fi;
    }
    public String getfi(){
        return fi;
    }
    
    //picture
    public void setpicture(String picture){
        this.picture = picture;
    }
    public String getpicture(){
        return picture;
    }
}
