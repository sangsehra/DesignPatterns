import java.util.Objects;

public class Node {
    int data;
    Node next = null;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void addNewNode(Node currentNode, int data){
           Node newNode = new Node();
            newNode.setNext(null);
            newNode.setData(data);

            while(Objects.nonNull(currentNode.next)){
                currentNode = currentNode.next;
             }
       currentNode.setNext(newNode);

    }
}
