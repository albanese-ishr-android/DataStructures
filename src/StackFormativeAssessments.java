import java.util.Stack;

public class StackFormativeAssessments {

    public static Stack nameStack = new Stack();

    public static void main(String[] args) {
        loadStack();
        searchStack(nameStack, "Sheldon Cooper");
    }

    public static void searchStack(Stack stack, String name){
        int position = 0;
        int namePosition = -1;
        String temp  = "";
        while(!stack.isEmpty()){
            temp = (String) stack.pop();
            if(temp == name){
                namePosition = position;
            }

            position = position + 1;
        }

        if(namePosition == -1){
            System.out.println("Name not found.");
        } else{
            System.out.println(name + " found at position " + Integer.toString(namePosition));
        }
    }

    public static void loadStack(){

        nameStack.push("Sophie");
        nameStack.push("Zara");
        nameStack.push("Abed");
        nameStack.push("Ryan");
        nameStack.push("Rick");
        nameStack.push("Jane");
        nameStack.push("Mia");
        nameStack.push("Troy");
    }
}
