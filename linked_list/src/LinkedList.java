public class LinkedList {
    private Node head;
    private int _length;

    public LinkedList() {
        this.head = null;
    }

    // Agrega un nodo a lo ultimo de la lista.

    public void addNode(int data) {
        Node newNode = new Node(data);
        Node current = this.head;

        if(current == null) {
            this.head = newNode;
            this._length++;
            return;
        }

        while(current.getNext() != null) {
            current = current.getNext();
        }

        current.setNext(newNode);
        this._length++;
    }

    public void removeLastNode() {
        if(this.head == null) {
            return;
        }

        Node current = this.head;

        if(current.getNext() == null) {
            this.head = null;
            this._length--;
            return;
        }

        while(current.getNext().getNext() != null) {
            current = current.getNext();
        }
        this._length--;
        current.setNext(null);

    }

    public int get_length() {
        return _length;
    }

    public String print() {
        if(this._length == 0) return "No hay nodos en la lista.";

        Node current = this.head;
        String toPrint = "";
        while(current != null) {
            toPrint += current.getData() + " => ";
            current = current.getNext();
        }

        toPrint += "X";

        return toPrint;
    }
}
