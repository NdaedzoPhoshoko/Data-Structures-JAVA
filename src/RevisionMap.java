import java.util.*;

public class RevisionMap {
    public static void main(String[] args) {
        Map<Integer, String> myStudents = new HashMap<Integer, String>(); //HashMap() is a constructur belongin to a class HashMap that doesnt care about order
    myStudents.put(2022, "Book A");
    myStudents.put(2021, "Book 2");
    myStudents.put(2020, "Book 3"); //this entry has already existing key so, doesnt allow duplicates
    myStudents.put(2022, "Book 4");
    
    //first way of displaying elements of Map
    System.out.println(myStudents);

    //using for-each loop
    for (Map.Entry<Integer, String> each: myStudents.entrySet())
    {
        System.out.print(each.getKey()+ ", ");
    }

    System.out.println("\nkey 2020="+ myStudents.get(2020)); //displays "Book A"
    //create a set that contains all keys from myStudents
    Set<Integer> myKeys = myStudents.keySet();
    System.out.println("keys are: "+ myKeys);

    //display elements in treeMap, note they will be stored in accending order
    TreeMap<Integer, String> n = new TreeMap<>(myStudents);
    for(Map.Entry<Integer, String> each: n.entrySet())
    {
        System.out.println(each.getKey()+ "="+ each.getValue());
    }

}
}

/*NOTES
 * Map - contains entries made up of a key and value pair. 
 *     - contains unique keys but can have duplicate values
 *     - Is an interface, no constructor Map<>()
 * examples
 *     - HashMap, a class doesnt maintains order
 *     - LinkedHashMap a class that maintains insertion order
 *     - TreeMap a class that maintains accending order
 * methods includes
 *     - put(key, value) add elements
 *     - putAll(map)
 *     - get(key)  returns a value from specified key
 *     - hashCode()   returns sum of all hash code(all elements)
 *     - entrySet() returns a set contains all values and keys
 *     - replace(key, newValue)  replaces value to newValue on the specified key
 *     - putIfAbsent(key, value)
 *     - remove(key, value)
 *     - remove(key)
 *     - keySet()  returns a set containing all keys
 *     - clear()
 *     - containsValue(value) returns true if value is there
 *     - containsKey(value) returns true if value is there
 * 
 * Map.Entry 
 * contains method getKey() and getValue() see line 15-18 above
 * 
 * always note: HashSet and HashMap do not care about order
 * DONT FORGET: TreeSet/TreeMap will always sort the elements in accending order
 * 
 */
