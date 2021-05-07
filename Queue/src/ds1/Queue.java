package ds1;

import java.util.Arrays;

public class Queue {

    private int[] queue_numbers;

    public void enqueue(int number){
        if(queue_numbers == null){
            queue_numbers = new int[1];
            queue_numbers[0] = number;
        }else{
            int[] temp = new int[queue_numbers.length + 1];
            for (int i = 0; i < queue_numbers.length; i++) {
                temp[i] = queue_numbers[i];
            }
            temp[temp.length - 1] = number;
            queue_numbers = temp;
        }

    }

    public void dequeue(){
        if(queue_numbers == null) {
            System.err.println("No item to dequeue from the Queue");
            return;
        }
        int[] temp = new int[queue_numbers.length -1 ];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = queue_numbers[i];
        }
        queue_numbers = temp;
    }

    public boolean empty(){
        return queue_numbers == null;
    }

    public int peek(){
        if(empty()){
            throw new RuntimeException("Queue is empty");
        }
        return queue_numbers[queue_numbers.length - 1];
    }

    public void clear(){
        queue_numbers = null;
    }

    public void print(){
        if(empty()){
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        for (int i = queue_numbers.length - 1; i >= 0 ; i--) {
            System.out.print(queue_numbers[i] + ",");
        }
        System.out.println("\b ]");
    }

    public boolean contains(int numbers){
        for (int i = 0; i < queue_numbers.length; i++) {
            if(queue_numbers[i] == numbers);
                return true;
            }
        return false;
    }

    public int size(){
        return queue_numbers == null ? 0 : queue_numbers.length;
    }
}
