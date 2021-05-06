import ds1.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(12);
        queue.enqueue(23);
        queue.enqueue(22);
        queue.print();
    }
}
