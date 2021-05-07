package ds;

import sun.misc.Queue;

public class Deque extends Queue {

    int[] numbers;

    public void rear_enqueue(int number){
        if(numbers == null){
            numbers = new int[1];
            numbers[0] = number;
        }
        else {
            int[] temp = new int[numbers.length + 1];
            for (int i = 0; i < numbers.length; i++) {
                temp[i] = numbers[i];

            }
            numbers = temp;
        }

    }
    public void front_dequeue(int number){

    }


}
