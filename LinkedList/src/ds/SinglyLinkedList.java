package ds;

import java.util.Arrays;

public class SinglyLinkedList {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
    public void add(SinglyLinkedList element, int data){

        Node newNode = new Node(data);
        newNode.next = null;

        if(element.head == null){
            element.head = newNode;
        }



    }
    public void add(int index, int data){}
    public void remove(int index){}
    public int get(int index){return 0;}
    public void print(){
        System.out.println(head);
    }
    public void clear(){}
    public int size(){return 0;}
    public boolean contains(int number){return false;}
    public boolean empty(){return true;}


}
