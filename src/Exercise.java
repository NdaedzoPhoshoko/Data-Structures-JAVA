/*exercise 1:
 * Write a java program that uses methods/functions and ArrayList
 * Create a method displayAllElements(ArrayList<Integer> myList)
 * The above method must remove last element from the list, change first element to a random number between 0 - 10
    then display all elements in the list
 * randomValue must be not be same as first value
 */


import java.util.*; //wildcard import
public class Exercise
{
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(3); //first value must be a different value : randomValue
        myNumbers.add(-2);
        myNumbers.add(2);
        myNumbers.add(2);
        myNumbers.add(30); //must be removed
        displayAllElements(myNumbers);//calling method
    }
    //Create a method displayAllElements
    public static void displayAllElements(ArrayList<Integer> myList)
    {
        //remove a last element from the list myList
        int indexOfLast = myList.size()-1;
        myList.remove(indexOfLast);

        //generating random number
         //validating that randomValue must not be equal to first value
        int randomVale = (int) (Math.random() * 10) + 1;
        while(randomVale == myList.get(0))
        {
            randomVale = (int) (Math.random() * 10) + 1; //type casting: 0 to 10 inclusively
        }

        //change first element in myList to be randomValue
        myList.set(0, randomVale);

        //display the ArrayList myList
        System.out.println(myList);
    }

}

/*exercise 2:
 * Write a method that that finds a maximum and minimum integer in the ArrayList
*/
/*
public static void findMaxAndMin(ArrayList<Integer> myList)
{
    //finding min
    int min = myList.get(0); //store first value in the list
    int max = myList.get(0);//store first value in the list
    for(int index=0; index < myList.size(); index++)
    {
        if(min > myList.get(index)) //suppose 4>2 that means 2 must be the min
        {
            min = myList.get(index);
        }

        if(max < myList.get(index))
        {
            max = myList.get(index);
        }
    }
}
 */

/*ALGORITHM for min
	1) Let first element to be in a variable min
             min = myList.get(0);
  2)    create a for loop that will traverse through elements one by one
           for( a=0; a< myList.size(); a++)
  3)   if( min > myList.get(a))
        set min = myList.get(a); is the new minimum
 */

 /*

import java.util.ArrayList;
public class Exercise
{
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(12);
        myNumbers.add(3);
        myNumbers.add(20);
        myNumbers.add(-1);

        //find the min and max
        findMaxAndMin(myNumbers);
    }
    public static void findMaxAndMin(ArrayList<Integer> myList)
{
    
    int min = myList.get(0); //store first value in the list
    int max = myList.get(0);//store first value in the list
    for(int index=0; index < myList.size(); index++)
    {
        //finding min
        if(min > myList.get(index)) //suppose 4>2 that means 2 must be the min
        {
            min = myList.get(index);
        }

        //finding max
        if(max < myList.get(index))
        {
            max = myList.get(index);
        }
    }

    System.out.println("\nMin: "+ min+"\nMax: "+ max);
}
}
  */

/*exercise 3:
 * 
 */

