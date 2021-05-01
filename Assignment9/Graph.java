import java.util.HashMap;
import java.util.LinkedList;

public class Graph {
    private HashMap<Node, LinkedList<Node>> adjacencyMap;

    public Graph() {
        adjacencyMap = new HashMap<>();
    }
    public void addEdgeHelper(Node a, Node b) {
        LinkedList<Node> tmp = adjacencyMap.get(a);

        if (tmp != null) {
            tmp.remove(b);
        }
        else tmp = new LinkedList<>();
        tmp.add(b);
        adjacencyMap.put(a,tmp);
    }

    public void addEdge(Node source, Node destination) {
        if (!adjacencyMap.keySet().contains(source))
            adjacencyMap.put(source, null);

        if (!adjacencyMap.keySet().contains(destination))
            adjacencyMap.put(destination, null);

        addEdgeHelper(source, destination);

    }
    public void resetNodesVisited() {
        for (Node node : adjacencyMap.keySet()) {
            node.unvisit();
        }
    }
    public void depthFirstSearchModified(Node node, int value) {
        depthFirstSearch(node, value);

        for (Node n : adjacencyMap.keySet()) {
            if (!n.visited) {
                depthFirstSearch(n,value);
            }
        }
    }
    public void depthFirstSearch(Node node, int value) {
        node.visit();
        if(value == node.value) {
            System.out.print(node.value + " found! \n");
        }

        LinkedList<Node> allNeighbors = adjacencyMap.get(node);
        if (allNeighbors == null)
            return;

        for (Node neighbor : allNeighbors) {
            if (!neighbor.visited)
                depthFirstSearch(neighbor, value);
        }
    }
    void breadthFirstSearch(Node node, int value) {

        if (node == null)
            return;

        LinkedList<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            Node currentFirst = queue.removeFirst();

            if (currentFirst.visited)
                continue;

            currentFirst.visit();

            if(value == currentFirst.value){
                System.out.print(currentFirst.value + " found! \n");
            }

            LinkedList<Node> allNeighbors = adjacencyMap.get(currentFirst);

            if (allNeighbors == null)
                continue;

            for (Node neighbor : allNeighbors) {
                if (!neighbor.visited) {
                    queue.add(neighbor);
                }
            }
        }
    }
    void breadthFirstSearchModified(Node node, int value) {
        breadthFirstSearch(node,value);

        for (Node n : adjacencyMap.keySet()) {
            if (!n.visited) {
                breadthFirstSearch(n, value);
            }
        }
    }
}
