package SuperClassFragility.After;

import java.util.ArrayList;

/**
 * Created by Daniel on 2/9/2017.
 */
public class Fragility {

    public static void main(String[] args) {
        MonitorableStack<String> stack = new MonitorableStack<>();
        stack.pushMany(new String[]{"abc", "def"});

        assert stack.maximumSizeSoFar() == 2 : "Unexpected max size: " + stack.maximumSizeSoFar();
    }


}

class Stack<T> {
    T[] contents = (T[])new Object[1000];
    private int stackPointer = 0;

    // Code change for push and pop to an array instead of arrayList
    public void push(T item) {
        assert stackPointer < contents.length : "push to full stack";
        contents[stackPointer++] = item;

    }

    public T pop() {

        assert stackPointer > 0 : "pop from empty stack";
        return contents[--stackPointer];
    }

    public void pushMany(T[] items) {
        assert (stackPointer + items.length) <= contents.length : "too many items";
        System.arraycopy(items, 0, contents, stackPointer, items.length);
        stackPointer += items.length;
    }

    public int size() { return contents.length;}
}

class MonitorableStack<T> extends Stack<T> {
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