import java.util.*; //wildcard import

public class RevisionArrayList {
    public static void main(String[] args) {
        ArrayList<Character> myList = new ArrayList<>(); //myList is an object
        myList.add('@'); //index 0
        myList.add('A'); //1
        myList.add('b'); //2
        myList.add('8');
        myList.add('+');

        myList.add(1, '&');
        myList.set(myList.indexOf('8'), '1'); //myList.set(3, '1');
        //myList.clear(); //the list will be cleared, and size becomes 0
        //what is the output of the following code
        //System.out.println(myList); //[@, &, A, b, 8, +] 
        /*Remember
         *ArrayList adds or removes elements at the end
         *ArrayList pushes elements sequentially without replacing them, unless you set the elements
         */

        //myList.remove(2); //new list []
        //char letter = myList.get(0);
        //System.out.println(letter); //output: @

        //write a code using a for loop, to display all elements in the list myList
        /*for(int i=0; i < myList.size(); i++ )
        {
            System.out.print(myList.get(i) + ", ");
        }*/

        //write a code using a for-each loop, to display all elements in the list myList
        /*for(char each: myList)
        {
            System.out.print(each+ ", ");
        }*/

        /*ListIterator
        ListIterator iterates/traverse through the list using forward or backward direction
        Syntax:
            ListIterator<dataType> nameOfListIterator = 
        */

        ListIterator<Character> myIterator = myList.listIterator();

        //display elements in a forward direction
        /*while(myIterator.hasNext())
        {
            System.out.print(myIterator.next()+", "); // @, A, &, b, 1, +
        }*/

        //display elements in a backward direction
        while(myIterator.hasPrevious())
        {
            System.out.print(myIterator.previous()+", "); //+, 1, b, &, A, @
        }

        /*Remember Both this lists shrinks and grows dynamically as we add elements 
         * ArrayList is used for adding and removing elements at the end of the list
         * LinkedList is used to insert and delete elements at any position
         *    - example: myLinkedList.remove(3); //amongst 20 elements
         * In an array once an array is created, the size is fixed, and we never remove elements
         */

         ArrayList<Character> myStudents = new ArrayList<>(myList); //default capacity = 10, size = 0
         myStudents.add('B');
         myStudents.add('P');
         for(char Lefa: myStudents)//display each element
         {
            System.out.print(Lefa+ ", ");
         }
         System.out.println("Size is :" + myStudents.size());
    }
}

