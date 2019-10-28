import java.util.ArrayList;

public class LinkedLists {

    public  static ArrayList<String> stringList = new  ArrayList<String>();

    public static void main(String[] args) {
        populateList();
        System.out.println(stringList.size());

        System.out.println(stringList.contains("This is string object number 1"));
    }

    public static void populateList(){

        for(int i = 0; i < 10; i++){
            String stringForList = "This is string object number " + Integer.toString(i);
            stringList.add(stringForList);
        }


    }
}
