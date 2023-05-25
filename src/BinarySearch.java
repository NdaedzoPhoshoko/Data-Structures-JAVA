import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        //suppose you want to search for a key in the array, use a binary search
        int[] list = {20, -4, 2, 0, 5, 3, 8};
        //   index    0   1  2   3  4  5  6
        //sorted list -4, 0, 2, 3, 5, 8, 20

        //step 1 sort the array
        Arrays.sort(list);

        //call thre binary search
        int indexOfKey = binarySearch(list, -4);

        //validate to see if whether value is found or not
        if(indexOfKey != -1)
        {
            System.out.print("Element found at index: "+ indexOfKey);
        }else{
            System.out.print("Element not found");
        }
    }

    public static int binarySearch(int[] array, int key)
    {
        //step 2
        int start = 0; //first index
        int last = array.length-1;

        //step 3 divide list into halve
        int mid = (start+last)/2;

        //step 4 create a while loop that suns as long as start<=last
        while(start<=last)
        {
            if(array[mid] == key)
            {
                return mid; //if value is found in middle
            }else if(array[mid] < key)
            {
                start = mid+1; //assume that the key is found in the upper half
            }else //array[mid] > key
            {
                  last = mid-1;
            }

            mid = (start+last)/2;
        }

        //step 5 if key is not there
        return -1;

    }
}
