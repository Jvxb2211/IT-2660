import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        Node dataSet = new Node(new int[]{4, 8, 15, 16, 23, 42});

        System.out.println("Is your number a Lost number?");
        int userInput = Input.nextInt();

        Node.searchTree(dataSet, userInput);
        if (Node.flag){ System.out.println("Yes!"); }
        else { System.out.println("No!"); }
    }
}

