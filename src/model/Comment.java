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
public class Comment {
    private String id;
    private enum kind{personal, group, member};
    kind thekind;
    private String comment;
    private String written;
    
    public Comment(String id, String k, String comment, String written){
        this.id = id;
        setkind(k);
        this.comment = comment;
        this.written = written;
        
    }
    
    public void setkind(String k){
        switch(k){
            case "group": thekind = kind.group;
                break;
            case "member": thekind = kind.member;
                break;
            case "personal": thekind = kind.personal;
                break;
        }
    }
    public kind getkind(){
        return thekind;
    }
    
    //comment
    public void setcomment(String c){
        comment = c;
    }
    public String getcomment(){
        return comment;
    }
    
    //written
    public  void setwritten(String w){
        written = w;
    }
    public String getwritten(){
        return written;
    }
    
}
