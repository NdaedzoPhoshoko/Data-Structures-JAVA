import java.util.*; //wildcard import

public class RevisionPriorityQueues {
   public static void main(String[] args) {
        PriorityQueue<Character> my_P_Queue = new PriorityQueue<>();
        my_P_Queue.add('W');
        my_P_Queue.add('A'); 
        my_P_Queue.add('N');
        my_P_Queue.add('3');

        System.out.println(my_P_Queue);
        /*
         according to natural ordering, queue will be [3, A, N, W]
         */

        PriorityQueue<Character> myNewQueue = new PriorityQueue<>();
        myNewQueue.add('P');
        myNewQueue.add('S');

        my_P_Queue.addAll(myNewQueue);

        myNewQueue.peek();

   }
    
}
