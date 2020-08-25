/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package helloproject;

import model.Person;
import model.Cat;

/**
 *
 * @author HP
 */

/*
* <access_modifier>                                                 <data_type>                   <name_of_variable>
* public, private, protected, default                                 int                         count, num_of_student
* public, private, protected, default                                 float                       amount
* public, private, protected, default                                 char                        option
* public, private, protected, default                                 boolean                     true/false
* public, private, protected, default                                 double                      amount
* public, private, protected, default                                 String                      name 
* public, private, protected, default                                 Array                       String[] list_of_name, Person[] people
* public, private, protected, default                                 Person                      umar, aliyu, abubakar
* public, private, protected, default                                 Hoe                         farmingHoe, diggingHoe
*/

public class HelloProject {
    
    public String name_of_class;
    private int num_of_person;
    
    public static void main(String[] args) {
        int result;
        Person umar;
        Cat myCat;
        
        umar = new Person();
        //myCat = new Cat("umar's cat");
        umar.farm();
        result = umar.add(1, 2);
        
        System.out.println(result);
    }
    
}