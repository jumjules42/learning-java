public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addNode(20);
        linkedList.addNode(30);
        linkedList.addNode(40);
        System.out.println(linkedList.print());
        System.out.println("El largo de la linked list es de: " + linkedList.get_length());
        linkedList.removeLastNode();
        System.out.println(linkedList.print());
    }
}
