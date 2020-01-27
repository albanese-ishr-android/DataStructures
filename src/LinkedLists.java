import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedLists {

    public static ArrayList<Client> clientArrayList = new ArrayList<>();
    public static LinkedList<Client> clientLinkedList = new LinkedList<>();

    public static void main(String[] args) {

        Client firstClient = new Client(23, "Tony", "Albanese");
        Client secondClient = new Client(25, "Alan", "Jones");
        Client thirdClient = new Client(53, "Beena", "Johnson");

        clientArrayList.add(firstClient);
        clientArrayList.add(secondClient);
        clientArrayList.add(thirdClient);

        clientLinkedList.add(firstClient);
        clientLinkedList.add(secondClient);
        clientLinkedList.add(thirdClient);

    }

    public static void populateList(){

        for(int i = 0; i < 10; i++){
            String stringForList = "This is string object number " + Integer.toString(i);

        }


    }
}
