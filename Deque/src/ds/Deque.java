package ds;

import sun.misc.Queue;

public class Deque extends Queue {

    int[] numbers;

    public void rear_enqueue(int number){
        if(numbers == null){
            numbers = new int[1];
            numbers[1] = number;
        }

    }
    public void front_dequeue(){}


}
