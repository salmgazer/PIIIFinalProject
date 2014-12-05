/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author salifu
 */
//imports
import model.*;
//end of imports
public class Mate {
    
    public static void main(String args[]){
    
        Location loc = new Location("loc2323", "Hall 218");
        Comment com = new Comment("com1", "group","I am loving my code!", "5-12-2014");
        System.out.println(loc.getid()+" "+ loc.getname());
        System.out.println();
        loc.setname("Hall 155");
        System.out.println(loc.getid()+" "+ loc.getname());
        
        System.out.println(com.getkind()+" "+com.getcomment());
        com.setkind("member");
        com.setcomment("I am happy");
        System.out.println(com.getkind()+" "+com.getcomment());
        
        
        
        
}
    
}
