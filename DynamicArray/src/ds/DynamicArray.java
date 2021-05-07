package ds;

import java.util.Arrays;

public class DynamicArray {

    private  int[] numbers;

    public void add(int number){
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

    public void add(int index, int number){

    }

    public boolean empty(){
        return true;
    }

    public void remove(int index){

    }

    public void clear(){
        numbers = null;
    }

    public void print(){
        System.out.println(Arrays.toString(numbers));

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


