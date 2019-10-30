import javax.swing.*;
import java.net.URLConnection;
import java.nio.Buffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ADT {

    public static Stack stack = new Stack();
    public static Queue queue = new LinkedList();
    public static LinkedList linkedList = new LinkedList();

    public static void main(String[] args) {

        usingQueues();
        usingStacks();

    }

    public static void usingStacks(){

        stack.push("One two three four");
        stack.push("I declare");
        stack.push("A thumb war");
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.empty());
    }

    public static void usingQueues(){

        queue.add("Winner");
        queue.add("Winner");
        queue.add("Chicken");
        queue.add("Dinner");

        System.out.println(queue);
        System.out.println(queue.peek());
        String removed = (String) queue.remove();
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
