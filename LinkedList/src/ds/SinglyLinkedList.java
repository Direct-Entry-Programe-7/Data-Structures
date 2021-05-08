package ds;

public class SinglyLinkedList {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            data = data;
            next = null;
        }
    }

    Node head = null;
    Node tail = null;

    public void add(int data){

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }

        }

    public void add(int index, int data){}
    public void remove(int index){}
    public int get(int index){return 0;}

    public void print(){
        Node Current = head;

        if(head == null){
            System.out.println("List is Empty");
            return;
        }


    }
    public void clear(){}
    public int size(){return 0;}
    public boolean contains(int number){return false;}
    public boolean empty(){return true;}


}
