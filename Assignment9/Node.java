public class Node {
    int n;
    int value;
    boolean visited;

    Node(int n, int value){
        this.n = n;
        this.value = value;
        visited = false;
    }
    void visit() {
        visited = true;
    }

    void unvisit() {
        visited = false;
    }


}
