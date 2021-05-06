package ds;

public class Stack {

    private int[] numbers;

    public void push(int number){
        if(numbers == null){
           numbers = new int[1];
           numbers[0] = number;
        }


    }
    public void pop(){

    }
    public  boolean empty(){
        return numbers == null;

    }
    public int peek(){
        return  0;

    }
    public void clear(){

    }
    public void print(){

    }
    public boolean contains(){
        return false;
    }
    public int size(){
        return 0;

    }
}
