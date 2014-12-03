/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.\
A  set in JAVA doesnot allow duplicates 
Set is of 3 types in JAVA :
1. HashSet
2. LinkedHashSet
3. TreeSet
This file contains all the methods for HashSet
name.add(element)
 */

/**
 *
 * @author amit
 */
import java.util.*;
public class TestHashSet<T> {
    public static void main(String [] args){
        Set<String> myHashSet = new HashSet<>();  // creation of HashSet
        String [] arr = {"London","Paris","New York","Moscow"};
        for(int i = 0; i< 4; i++){
            myHashSet.add(arr[i]);    // add to HashSet
        }
        Iterator <String> my = myHashSet.iterator();   // iterator
        
       // System.out.println(myHashSet);
        myHashSet.add("Paris");
        
        System.out.println(myHashSet.size());   // // get size of hash set

        System.out.println(myHashSet);
        Set <String> myHashSet1 = new HashSet<>();
        String [] arr1 = {"Delhi","Bombay","Chennai","Calcutta"};
        for(int i = 0; i< 4; i++){
            myHashSet1.add(arr1[i]);
        }
        Iterator<String> it = myHashSet1.iterator();
        System.out.println(myHashSet1);
        myHashSet.addAll(myHashSet1);             // addAll  adds all the entire one set into another
        System.out.println(myHashSet);
        System.out.println(myHashSet1);
        boolean val = myHashSet.contains("Purnea");   // check if a particular object is in HashSet
        System.out.println(val);
        val = myHashSet1.contains("New York");
        System.out.println(val);
      //  <T> [] array = myHashSet.toArray();
       // T [] lis = myHashSet.toArray();
        Object [] array = myHashSet.toArray();
    }
    
}
