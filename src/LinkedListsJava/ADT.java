package LinkedListsJava;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ADT {

    public static Stack stack = new Stack();
    public static Queue queue = new LinkedList();
    public static LinkedList linkedList = new LinkedList();

    public static void main(String[] args) {

        stack.push("Hello.");
        stack.push("Chicken");
        stack.push("Dinner");
        stack.push("Winner");
         System.out.println(stack.peek());
         stack.pop();
         System.out.println(stack.peek());
         System.out.println(stack.size());
         System.out.println(stack.firstElement());

         queue.add("Winner");
         queue.add("Winner");
         queue.add("Chicken");
         queue.add("Dinner");

         System.out.println(queue.peek());
         String removed = (String) queue.remove();
         System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        linkedList.add("Hello");
        linkedList.add(2);
        linkedList.add("Tired");
        linkedList.add(4);
    }
}
