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
public class Member {
    private String firstname;
    private String lastname;
    private enum sex{M, F};
    sex thesex;
    private String id;
    private int rank;
    private String picture;
    private String nickname;
    
    public Member(String id, String firstname, String lastname, String s, int rank, String picture){
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        setsex(s);
        this.rank = rank;
        this.picture = picture;
    }
    
    //id
    public String getid(){
        return id;
    }
    
    public void setsex(String s){
        switch(s){
            case "M": thesex = sex.M;
                break;
            case "F": thesex = sex.F;
                break;
        }
    }
    public sex getsex(){
        return thesex;
    }
    
    //rank
    public void setrank(int r){
        rank = r;
    }
    public int getrank(){
       return rank;
    }
    
    //picture
    public void setpicture(String p){
        picture = p;
    }
    public String getpicture(){
        return picture;
    }
    
    //nickname
    public void setnickname(String n){
        nickname = n;
    }
    public String getnicky(){
        return nickname;
    }
    
    //firstname
    public void setfn(String fn){
        firstname = fn;
    }
    public String getfn(){
        return firstname;
    }
    
    //lastname
    public void setln(String ln){
        lastname = ln;
    }
    public String getln(){
        return lastname;
    }
    
    
}
