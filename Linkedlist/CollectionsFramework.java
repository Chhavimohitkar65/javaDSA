package Linkedlist;
import java.util.*;

// Collections Framework

public class CollectionsFramework {
    
public static void main(String[]args){
    LinkedList<Integer> list = new LinkedList<Integer>();

    list.addFirst(1);
    list.addFirst(2);
    list.addLast(4);

    System.out.println(list);
    System.out.println(list.size());

    for(int i = 0 ; i<list.size(); i++){
        System.out.print(list.get(i) + "->");
    }
    System.out.println("null");

    list.removeFirst();
    System.out.println(list);

    
}


}
