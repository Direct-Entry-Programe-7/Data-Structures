import ds1.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.print();
        queue.dequeue();
        queue.enqueue(50);
        queue.print();
        System.out.println(queue.peek());
        System.out.println(queue.contains(200));
        System.out.println(queue.size());
        queue.clear();
        System.out.println(queue.peek());
        queue.print();


    }
}
