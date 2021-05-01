import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph();
        Random rand = new Random();
        Scanner Input = new Scanner(System.in);
        int nodesVisited = 0;
        boolean run = true;
        Node[] Vertexes = new Node[1000];
        for (int i = 0; i < 1000; i++) {
            Vertexes[i] = new Node(i, rand.nextInt(100001));
        }

        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < rand.nextInt(5) + 1; j++) {
                graph.addEdge(Vertexes[i], Vertexes[rand.nextInt(1000)]);
            }
        }
        while (run) {
            System.out.println("Type 1 for Breadth-First search or 2 for Depth-First Search");
            int userInput = Input.nextInt();
            if (userInput == 1) {
                System.out.println("Enter a number between 1 and 1000 as your starting point");
                int root = Input.nextInt();
                System.out.println("Enter a value to search for in the graph");
                int val = Input.nextInt();
                graph.breadthFirstSearchModified(Vertexes[root - 1], val);
                for (int i = 0; i < 1000; i++) {
                    if (Vertexes[i].visited) {
                        nodesVisited++;
                    }
                }
                System.out.println("\nNodes visited: " + nodesVisited);
                nodesVisited = 0;
                graph.resetNodesVisited();
            } else if (userInput == 2) {
                System.out.println("Enter a number between 1 and 1000 as your starting point");
                int root = Input.nextInt();
                System.out.println("Enter a value to search for in the graph");
                int val = Input.nextInt();
                graph.depthFirstSearchModified(Vertexes[root - 1], val);
                for (int i = 0; i < 1000; i++) {
                    if (Vertexes[i].visited) {
                        nodesVisited++;
                    }
                }
                System.out.println("\nNodes visited: " + nodesVisited);
                nodesVisited = 0;
                graph.resetNodesVisited();
            } else {
                System.out.println("Please make a valid selection");
            }


        }
    }
}
