import ds1.Deque;

public class DequeTest {
    public static void main(String[] args) {
        Deque deque = new Deque();
        deque.enqueue(10);
        deque.enqueue(20);
        deque.print();
        deque.enqueueRear(200);
        deque.print();
        deque.dequeFront();
        deque.print();


    }
}
