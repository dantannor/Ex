package SuperClassFragility.Before;

import java.util.ArrayList;

/**
 * Created by Daniel on 2/9/2017.
 */
public class Fragility {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("1");
        String s = stack.pop();
    }


}

class Stack<T> {
    ArrayList<T> contents = new ArrayList<T>();
    private int stackPointer = 0;

    public void push(T item) {
        contents.add(stackPointer++, item);
    }

    public T pop() {
        return contents.remove(--stackPointer);
    }

    public void pushMany(T[] items) {
        for (T item : items) {
            push(item);
        }
    }

    public int size() { return contents.size();}
}

class MonitorableStack<T> extends  Stack<T>{
    private int highWaterMark = 0;
    public int maximumSizeSoFar(){
        return highWaterMark;
    }
    @Override public void push(T item){
        if (size() > highWaterMark){
            highWaterMark = size();
        }
        super.push(item);
    }
}