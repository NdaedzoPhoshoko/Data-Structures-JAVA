import java.util.Vector;

public class RevisionVector {
    public static void main(String[] args) {
        Vector<Object> myV_list = new Vector<>();
        myV_list.add('B');                    //index 0
        myV_list.add("What?");                //index 1
        myV_list.add(23);                     //index 2
        String var = myV_list.elementAt(0).toString();
        myV_list.add(var);                      //index 3
        myV_list.add(12.586);                   //index 4
        myV_list.add(3, "No no!");  //index 5 pushes elements from index 3 to the right

        //display elements in a vector
        System.out.println("Vector list: "+ myV_list);

        //display elements in a vectorin a numbered list using for each loop
        int count = 0;
        for (Object each : myV_list) {
            ++count;
            System.out.println("Value "+ count + ": "+ each);
        }
        /*Try with other methods, check them from NOTES below */

    }
}

/*NOTES!
 * Well, another kind of a list is Vector, also defined as a growable array
 * Vector is a class( order same as ArrayList)
 * Vector is poor when adding, searching, deleting and updating elements
 * Since Vector is a class it contains constructors such as 
 *    Vector<>(); initial capacity = 10
 *    Vector<>(size); initial capacity is given by size
 *    Vector<>(size, incr);
 *    Vector<>(Collection c); vector will contain elements of Collection c
 * 
 * examples of methods in a Vector class
 - add(e)
 - add(index, e)
 - addAll(Collection c)
 - addAll(index, Collection c)
 - capacity()  returns current capacit of this vector
 - clear()
 - lastElement()
 - get(index)
 - set(index, e)
 - indexOf()
 - insertElementAt(e, index)
 - listIterator()  to iterate through elements using ListIterator
 - remove(e)
 - removeAll(Collection c)  removes all elements from the specifies Collection c
 - size()
 - setSize(newSize) set size to newSize
 - subList(fromIndex, toIndex)    returns shortList starting at fromIndex to not include toIndex

 NOTE: dataType Object is used when we want to create data structures that store heterogeneous data(different types of data)
 * 
 */
