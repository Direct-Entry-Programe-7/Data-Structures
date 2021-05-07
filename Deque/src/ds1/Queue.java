package ds1;

import java.util.Arrays;

public class Queue {

    protected int[] numbers;

    public void enqueue(int number){
        if(numbers == null){
            numbers = new int[1];
            numbers[0] = number;
        }else{
            int[] temp = new int[numbers.length + 1];
            for (int i = 0; i <numbers.length; i++) {
                temp[i] = numbers[i];
            }
            temp[temp.length - 1] = number;
            numbers = temp;
        }

    }

    public void dequeue(){
        if ( numbers == null) {
            System.err.println("No item to dequeue from the Queue");
            return;
        }
        int[] temp = new int[numbers.length -1 ];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = numbers[i];
        }
        numbers = temp;
    }

    public boolean empty(){
        return numbers == null;
    }

    public int peek(){
        if(empty()){
            throw new RuntimeException("Queue is empty");
        }
        return numbers[numbers.length - 1];
    }

    public void clear(){
        numbers = null;
    }

    public void print(){
        if(empty()){
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        for (int i = numbers.length - 1; i >= 0 ; i--) {
            System.out.print(numbers[i] + ",");
        }
        System.out.println("\b ]");
    }

    public boolean contains(int number){
        for (int i = 0; i < numbers.length; i++) {
            if( numbers[i] == number);
                return true;
            }
        return false;
    }

    public int size(){
        return numbers == null ? 0 : numbers.length;
    }
}
