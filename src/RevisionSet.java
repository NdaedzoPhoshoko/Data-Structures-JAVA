import java.util.*; //wildcard import

public class RevisionSet {
    public static void main(String[] args) {
        /*Suppose we have two sets, A = {2,3,5,7}, B = {3, 10}
         * We can find difference using A - B = {2, 5, 7}
         * Q is: how we do this using data structures, the answer is Set has removeAll(c)
        */
        Set<Integer> A = new HashSet<>();
        A.add(7);
        A.add(3);
        A.add(5);
        A.add(2);
        //A = {2,3,5,7}

        //study hashcode on line 81
        System.out.println("Sum of all elements/hashCode in A is: "+ A.hashCode());//sum of all elements
        
        Set<Integer> B = new HashSet<Integer>();
        B.add(3);
        B.add(10);
        //B = {3, 10}

        //A.removeAll(B); //A - B to find difference, on A remove all elements of B
        //System.out.println(" A - B = "+  A);// A = {2, 5, 7}

        /*We can find intersection using A n B = {3}
        * Q is: how we do this using data structures, the answer is Set has retainAll(c)
        */
        //A.retainAll(B); //check for intersection and remove all elements not in intersection
        //System.out.println("A n B = "+ A); // A n B = {3}
        
        Set<String> shel011 = new HashSet<>(); //set of students that failed shel011
        shel011.add("Mike");
        shel011.add("Ndaedzo");
        shel011.add("Jane");
        shel011.add("Alice");
        shel011.add("Pete");
        shel011.add("Mike");
        shel011.add("John");
        shel011.add("Peter");

        //display size
        System.out.println("Size of Shel011 students is "+ shel011.size());

        Set<String> smth011 = new HashSet<>(); //set of students that failed smth011
        smth011.add("Ndaedzo");
        smth011.add("Michonne");
        smth011.add("Mike");
        smth011.add("Jon");
        smth011.add("Isabella");
        //observe that some students who failed shel011 has also failed smth011

        shel011.retainAll(smth011); //shel011 will have students that failed both
        //show students that failed both
        System.out.println("Students that failed both tests are: "+ shel011);
    

    }
}

/*NOTES
 * Set is an interface, hence no constructor
 * Set contains no duplicates {1,2,3} + {2,3} = {1,2,3}
 * Stores elements in accending order
 * Type of Sets include 
    - HashSet               class
    - LinkedHashSet         class
    - SortedSet             interface
    - NavigableSet          interface
    - TreeSet               class

 * HashSet class
 * stores no duplicates
 * there is much to say though! just no duplicates
 * contains methods such as
    - retainAll(c) removes all elements and leaves intersection
    - containsAll(c) returns true if all elements in c ae in the list
    - contains(e)
    - hashCode()   returns sum of all elements in the set
    - removeAll() finds difference between two sets, e.g  set1 - set2 = set1 havng remove all elements from set2
    - also has iterator(),  note: not a listIterator
    meaning create an iterator as 
    Iterator<dataType> nameOfTheIterator = mySetName.iterator();   since iterator is an interface

    Difference between sets and lists is that
    - In set we cannot store duplicates while a list allows duplicates

       List<Character> myList = new ArrayList<>();
        myList.add('G');
        myList.add('G');
        myList.add('A');
        Set<Character> myHashSet = new HashSet<>(myList);

        //what are the elements of myHashSet?? [A, G] no duplicates in sets
        System.out.println(myHashSet);
 */
