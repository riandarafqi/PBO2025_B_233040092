package TugasKelasObjek;

public class Main {
    public static void main(String[] args) {
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        node1.setNext(node2);
        System.out.println(node1.getValue()); // Output: 10
        System.out.println(node1.getNext().getValue()); // Output: 20
    }
}