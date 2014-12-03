/*
 * JCF provides ith 3 collections :
1. Set
2. List
3. Map
1. Set has 3 sub collections : a. HashSet, b. LinkedHashSet, c. TreeSet(sorted)
2. List  has 2 classes : a ArrayList , b. LinkedList
USE Collections.sort(listName) to sort the list
USE Arrays.sort(arrayName) to sort the array;
Collections contains many methods like max, min, keep seeing Collections class often
USEFUL functions in collection :
1. sort(list)
2. max(list)
3. min(list)
4. binarySearch(List,target); // returns int see code below
5. reverse(list)
6. frequency(list, item) ; // returns the frequency of item in the list
7. cool one : disjoint(list1,list2) returns true if both lists are identical else returns false

 */

/*
 * @author amit
 */
import java.util.*;
public class TestList {
    public static void main(String [] args){
        List<Integer> arrayL = new ArrayList<>();   // creation of an array list;
        arrayL.add(0,10);   // adding into arrayList (index, value);
        arrayL.add(12);  // also one can add without using the index position.
        arrayL.add(13);
        System.out.println(arrayL);
        Iterator my = arrayL.iterator();
        while(my.hasNext()){
            System.out.print(my.next()+" ");
        }
       // Arrays.
        System.out.println("");
        arrayL.remove(new Integer(10));   // removes the specified object
        arrayL.remove(1);   // removes at the specified index
        arrayL.add(12);   // Unlike set, a list can hold duplicate values
        arrayL.remove(new Integer(12));   // remove
        arrayL.add(111);
        System.out.println(arrayL);
        System.out.println(Collections.max(arrayL));
        // create a LinkedList
        List <String> myll = new LinkedList<>();
        String [] arr = {"Hello","World","GoodBye","Cruel","World"};
        int len = arr.length;
        for(int i = 0; i< len; i++){
            myll.add(arr[i]);
        }
        Iterator<String> mi = myll.iterator();
        while(mi.hasNext()){
            System.out.print(mi.next()+" ");
        }
        Collections.sort(myll);        // A list can be sorted using Collections.sort(listname)
        System.out.println("After Sorting :.....");
        System.out.println(myll);
        int index = Collections.binarySearch(myll, "World");
        System.out.println(index);
        index = Collections.frequency(myll, "World");
        System.out.println(index);
      
        /******************************************
         * Lists can be sorted using Collections.sort(listname)  ,
         * BUT if you have to sort arrays use Arrays.sort(arrayname);
         */
       
                
}
}
