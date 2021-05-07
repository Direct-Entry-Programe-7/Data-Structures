package ds2;

import ds1.Queue;

public class Deque extends Queue {

    public void enqueueRear(int number){
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
    public void dequeueFront(){

    }


}
