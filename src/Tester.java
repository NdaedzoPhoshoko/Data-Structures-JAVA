/*import java.util.Scanner;
public class Tester {
    public static void main(String[] args){
         Scanner input = new Scanner(System.in);

        //prompt two values from user and divide value1 with value2
        //and handle Exception if value2 is 0
        System.out.println("Enter value1: ");
        int value1 = input.nextInt();

        System.out.println("Enter value2: ");
        int value2 = input.nextInt();

        try
        {
            int result = value1/value2;
        }catch(ArithmeticException myError)
        {
            System.out.println("Error: "+ myError.getMessage());
        }finally{
            System.out.println("Program finished"); //this part is always excecuted
        }
    }
}
*/

/*
 * Once the JVM encounters an Exeption, it stops the program where the error has occured
 * Other lines of code are not executed, which is bad, so we handle the exception
 * 
 We handle Exceptions using the 
      try{
          //put the testing code here
     }catch(ExceptionName object)
        {
            //show the error here using the object
        } finally
        {
            //this part is always shown
        } statement
 */

/*
public class Tester
{
    public static void main(String[] args)
    {
        //two dimensional array [row][column] is like forming a table
        int[][] x = {
            {1,2},    //row index 0
            {3,4,5,4}, //row index 1
            {5,6}    //row index 2
        };

        System.out.println("length x: "+ x.length); // length x: 3
        System.out.println("length x[1]: "+ x[1].length); // length x[1]: 4

        //one can say ...
        int[][] nameOfArray = new int[3][4]; //3 rowns, 4 columns
        nameOfArray[0][0] = 1; //row index 0 column index 0
        nameOfArray[0][1] = 2; //row index 0 column index 1
        nameOfArray[1][0] = 3; //row index 1 column index 0 
        nameOfArray[1][1] = 4; //row index 1 column index 1
        //.
        //.
        //etc.....

        System.out.println("length nameOfArray: "+ nameOfArray.length); //length nameOfArray: 3
    }
}
*/

/*
import java.util.ArrayList;
import java.util.LinkedList;
public class Tester
{
    public static void main(String[] args) {
        //add 10 000 random doubles between 10.0 and 100.0 in ArrayList and LinkedList
        ArrayList<Double> list1 = new ArrayList<>();
        LinkedList<Double> list2 = new LinkedList<>();
        int count = 0;
        double random;
        do
        {
            random = (Math.random()*100) + 1.0; //value between [0.0, 100.0]
            list1.add(random);
            list2.add(random);
            count++;
        }while(count<10000);

        //now both these have 10 000 decimal numbers
        //let us test which runs faster, logic here being let us use timmer 
        //timmer will count in seconds how long it takes for each list to sum all the elements
        //note: 1000 milliseconds = 1 second
        

        //measure running time here
        double sum = 0;
        long start = System.currentTimeMillis(); //start counting millisec
        for(int i=0; i< list1.size(); i++)
        {
            sum += list1.get(i);
        }
        long end = System.currentTimeMillis(); //stop counting
        long totalSecondsArrayList = (end - start);  

        //and then measure running time here
        double sum1 = 0;
        start = System.currentTimeMillis(); //start counting millisec
        for(int i=0; i< list2.size(); i++)
        {
            sum1 += list2.get(i);
        }
        end = System.currentTimeMillis(); //stop counting
        long totalSecondsLinkedList = (end - start);

        System.out.println("ArrayList took: "+ totalSecondsArrayList+ " milliseconds to make sum: "+ sum);
        System.out.print("LinkedList took: "+ totalSecondsLinkedList+ " milliseconds to make sum: "+ sum1);

        //Conclusion: ArrayList executes faster than LinkedList on this case of retriving/getting elements at specified index
        
    }
}
*/

/*
public class Tester
{
    public static void main(String[] args) {
        int[] name = {12,23,45,67};

        double[][] decimals = {
            //rows     index 
            {12, 3},   //row 1 has row index  0
            {4, 5, -1}, //row 2 has row index 1
            {2, -1, 3, 4}   //row 3 has row index 2
        }; //hence length is 2 ( since 2 rows)

        System.out.println("length of 2d array: " + decimals.length);
        System.out.println("length of row 1: " + decimals[0].length);  //2 elements
        System.out.println("length of row 2: " + decimals[1].length);   //3 elements
        System.out.println("length of row 3: " + decimals[2].length);   //4 elements
        
        
    }
}
*/

/*
   int[][] name = new int[2][3];
 * Two dimension is in the form of a table
 * 12   3 
 * 4    5  -1
 * 2   -1   3  4
 * 
 * NOTES: length of a two dimensional array = number of rows
 */

 /*In arrayList:
      accessing elements is done in constant time hence faster for accessing elements
      list1.get(i);
      is faster for retriving elements
      is slower for removing elements, arrays makes it hard to remove elements

  In LinkedList elements an element is accessed after traversing(going through) the entire list
  * is slower for retriving elements
    is faster for removing and inserting elements
  */

  // sum += list1.get(i)          sum = sum + list1.get(i)


/* 2.1
 * code fragment A will run faster than code fragment B since ArrayList runs faster when retrieving elements
 * using get(i)
 */

 /*
 //2.2 contains(e);

 import java.util.TreeSet;
 public class Tester
 {
    public static void main(String[] args) {
        TreeSet<Integer> mySet = new TreeSet<>();
        mySet.add(12);
        mySet.add(23);
        mySet.add(3);
        mySet.add(-1);
        //dont forget: TreeSet akways sort in ascending order, again never stores duplicates

        if(mySet.contains(23))
        {
            System.out.println("element is found, here's your set: "+ mySet);
        }else
        {
            System.out.println("element is not found, here's your set: "+ mySet);
        }  

    }
 }
*/

/*//2.3
import java.util.ArrayList;
public class Tester
{
   public static void main(String[] args) {
       ArrayList<Integer> list1 = new ArrayList<>();
       list1.add(1);
       list1.add(2);
       list1.add(5);
       //list1 : [1,2,5]

       ArrayList<Integer> list2 = new ArrayList<>();
       list2.add(2);
       list2.add(3);
       list2.add(6);
       //list1 : [2,3,6]

       list1.addAll(list2);
       //list1: [1,2,5,2,3,6]
       //list2: [2,3,6]

       System.out.println(
        "list1: "+ list1+ "\n"+
        "list2: "+ list2+ "\n"
       );

   }
}
*/

//2.4 [1,2,3,5,6]

//Q3 Binary Search
/*
import java.util.Arrays;
import java.util.Scanner;

public class Tester
{
   public static void main(String[] args) {

    Scanner myInput = new Scanner(System.in);
       int[] array = {67,22,5, 73,99,45,101,32,10,98};
       //sort the array for Binary Search to work
       Arrays.sort(array);

       System.out.print("Enter the number you are searching for: ");
       int searchvalue = myInput.nextInt();
       int isFound = binarySearch(array, searchvalue);

       if(isFound != -1)//if found
       {
          System.out.println("Item was found at index location: "+ isFound);
       }else{ //if not found
            System.out.println("Item was not found in the list");
       }



   }

   public static int binarySearch(int[] arr, int key)
   {
       int firstIndex = 0;
       int lastIndex = arr.length-1;
       int mid = (firstIndex+lastIndex)/2;
       while( firstIndex <= lastIndex)
       {
           if(arr[mid] == key)
           {
               return mid; //index of middle value
           }else if(arr[mid] < key)
           {
               firstIndex = mid+1;
           }else if(arr[mid] > key)
           {
              lastIndex = mid-1;
           }

           mid = (firstIndex+ lastIndex)/2;
       }

       return -1; //-1 if not found
   }
}
*/