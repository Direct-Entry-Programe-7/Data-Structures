import ds1.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(200);
        queue.enqueue(344);
        queue.enqueue(45);
        queue.print();
        queue.dequeue();
        queue.print();
        System.out.println(queue.peek());
        System.out.println(queue.contains(200));
    }
}
