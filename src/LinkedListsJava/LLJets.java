package LinkedListsJava;

import java.util.LinkedList;

public class LLJets {

    public static LinkedList<String> list;

    public static void main(String[] args) {
        list = new LinkedList<String>();
        populateList();
        list.addFirst("I've been addeded to the head.");
        list.addLast("I've beened addeded at the tail.");
        //System.out.println(list.size());
        //printListContents(list);
        //String element = list.element();
        //System.out.println(element);
        list.remove();
        list.remove(0);

        System.out.println(list.isEmpty());

        printListContents(list);

    }


    public static void populateList(){
        for(int x = 1; x <= 10; x++ ){
            list.add("This is string object number: " + x);
        }
    }

    public static void printListContents(LinkedList<String> list){
        for(String string : list){
            System.out.println(string);
        }
    }
}
