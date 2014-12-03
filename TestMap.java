/*
 * JCF gives us 3 collections : 1. Set 2. List 3. Map 
1. Set has 3 subtyes : 1. HashSet, 2. LinkedHashSet, 3. TreeSet(Sorted)
2. List : are 2 tyes : 1. ArrayList, 2.LinkedList 
3. Map : 3 types : a. HashMap    b. LinkedHashMap    c. TreeMap (sorted keys)
Creation : Map <Key, Value> name = new HashMap<Key, Value>();
to insert : HashMap.put(Key,value);
to get value: HashMap.get(Key);
to check if key already : HashMap.containsKey(key);
to check if value already : HashMap.containsValue(value);
so just remember: 
1. HashMap.put(Key,value)
2. HashMap.get(key);
3. HashMap.containsKey(key);
4. HashMap.containsValue(Value);
5. also : isEmpty(), remove(key)
 */

/**
 *
 * @author amit
 */

import java.util.*;
public class TestMap {
    public static void main(String [] args){
        // Map creation  First entery is the key and second value
        Map <String, Integer> myHashMap = new HashMap<>();  
       
        
        // insertion  
        myHashMap.put("Smith", 30);
        myHashMap.put("Anderson",31);
        myHashMap.put("Lewis", 29);
        myHashMap.put("Cook",29);
        
        // printing out the entire HashMap
        System.out.println(myHashMap);
        
        // get the value from HashMap given key 
        System.out.println(myHashMap.get("Cook"));
        
        // To check if a key already in Map
        boolean val = myHashMap.containsKey("Lewis");
        System.out.println("Checking for key Lewis , must print true........."+val);
        val = myHashMap.containsKey("Amit");
        System.out.println("Checking for key Amit, must print false.........."+val);
        val = myHashMap.containsValue(21);
        System.out.println("Checking for value 21, must print false.........."+val);
        val = myHashMap.containsValue(29);
        System.out.println("Checking for value 29, must print true..........."+val);
        
        /**********************************************************
         * As you can see the HashMap doesnot preserve the order in which
         * insertion was done, If you need to preserve the order of insertion 
         * use LinkedHashMap. 
         * 
         ***********************************************************/
        Map <String, Integer> mylhashMap = new LinkedHashMap<String, Integer>();
        mylhashMap.put("Smith", 30);
        mylhashMap.put("Anderson",31);
        mylhashMap.put("Lewis", 29);
        mylhashMap.put("Cook",29);
        System.out.println(mylhashMap);
        
        /************************************************************
        * AS you can see , the order of insertion is reflected in the 
        * output , but if you need to maintain your hash based on sorted 
        * key , then you must use TreeMap.
        *************************************************************/
        Map<String,Integer> myTreeMap = new TreeMap<String, Integer>();
        myTreeMap.put("Smith", 30);
        myTreeMap.put("Anderson",31);
        myTreeMap.put("Lewis",29);
        myTreeMap.put("Cook", 29);
        System.out.println(myTreeMap);
        
    }
    
}
