package ds;

public class DynamicArray {

    private  int[] numbers;

    public void add(int number){

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


