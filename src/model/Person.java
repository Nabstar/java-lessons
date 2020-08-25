/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import tools.Hoe;

/**
 *
 * @author HP
 */
public class Person {
    
    private String name;
    private int age;
    private Hoe personHoe;

    
    
    /*
    * <access_modifier>                              <name_of_method>           (<parameter_list>)     
    * public, private, protected, default             <name_of_class>            int fnum, int snum
    * public, private, protected, default             <name_of_class>            empty
    */

    
    public void farm() {
        personHoe = new Hoe();
        personHoe.farm("umar");
    }
    
    
    /*
    * <access_modifier>                            <return_type>                 <name_of_method>           (<parameter_list>)     
    * public, private, protected, default             int                         add                        int fnum, int snum
    * public, private, protected, default             void                        farm                       empty
    */
    public int add(int fnum, int snum) {
        
        int result;
        
        result = fnum + snum;
        
        return result;
    
    }
    
}
