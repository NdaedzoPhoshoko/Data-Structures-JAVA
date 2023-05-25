import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet1 {
    public static void main(String[] args) {
        SortedSet<String> mySet = new TreeSet<>();
        mySet.add("Mike");
        mySet.add("Naina");
        mySet.add("Abel");
        mySet.add("Kate");
        mySet.add("Kabelo");

        System.out.println(mySet); //sorted elements according to natural ordering
        System.out.println("First element: "+ mySet.first());
        System.out.println("Last element: "+ mySet.last());

        //diplays sortedSet from first() to "Kate", kate is excluded
        System.out.println("Sorted set from frist to Kate "+mySet.headSet("Kate"));

        //diplays sortedSet from "Kate" to last(), kate is excluded
        System.out.println("Sorted set from Kate to last "+mySet.tailSet("Kate"));
        //or use subset(fromElement, toElement) but toElement is excluded
        //System.out.println(mySet.subSet("Kate", Nainaz)); //we used Nainaz becuase we want to include Naina
    }
}
