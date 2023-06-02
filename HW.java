import org.w3c.dom.ls.LSOutput;

public class List {
    Node head;
    Node tail;


    public class Node {
        int value;
        Node next;

        Node previous;
    }


    public void RevertTwoWaysList(){
        Node currentNode = head;
        while (currentNode != null){
            Node next = currentNode.next;
            Node previous = currentNode.previous;
            currentNode.next = previous;
            currentNode.previous = next;
            if (previous == null){
                tail = currentNode;
            }
            if (next == null){
                head = currentNode;
            }
            currentNode = next;
        }
    }

}
