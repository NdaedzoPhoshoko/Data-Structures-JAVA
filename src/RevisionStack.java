import java.util.Stack;

public class RevisionStack {
    public static void main(String[] args) {
        Stack<String> myObject = new Stack<>(); //created an empty stack

        //store few book names to stack
        myObject.push("The Lord of The Rings");
        myObject.push("How to use Stacks");
        myObject.push("2023 Dev Ops");
        myObject.push("Spiderman 3");
        myObject.push("Kamasutra Han");

        System.out.println("Stack is : "+ myObject);
        //show element ontop of the stack, must be the last to be added
        System.out.println("Element ontop: "+ myObject.pop()); //pop() will make last element to be removed from the list
        //show another element ontop of the stack, after previous pop() was called
        System.out.println("Element ontop is now: "+ myObject.pop());


        /*Try working with other methods */
    }
}

/*Notes
 * Stack is a subclass of Vector
 * Stack stores every new element ontop of previous ones
 * Imagine a situation of piling books ontop of each other, the book that came first will be the last to remove right?
 * while the one that came last is the first to be removed( this order is known as First-In-Last-Out or Last-In-First-Out)
 * Stack always remove last elements to be added in the list
 * Two important methods on a stack
 *     - push() - add element in the stack
 *     - pop()  - removes and return last element from the stack
 * 
 * Other methods are
 * empty(), search(), peek();
 * 
 * Constructor Stack<>() creates an empty stack

 Next time speak about Sets, Maps, HashSet and HashMap, TreeSet,  too
 The difference between list and set is: A list can contain duplicate entries, but set contains unique elements only
 */