
/**
 * Created by Daniel on 27-Dec-16.
 */
public class MyArrayList {

    private Object[] arr;
    private int size = 10;
    public int length = 0;


    public MyArrayList() {
        arr = new Object[size];
    }

    public void add(Object o){
        if(length == size){
            increaseSize();
        }

        arr[length++] = o;
    }

    public Object get(int i){
        if(i > length - 1 || i < 0)
            throw new IndexOutOfBoundsException();

        return arr[i];
    }

    public void remove(int i){
        if(i > length - 1 || i < 0)
            throw new IndexOutOfBoundsException();

        int cur = i;

        while(cur < length - 1){
            arr[cur] = arr[cur+1];
            cur++;
        }

        length--;
    }

    private void increaseSize() {
        size *= 2;
        Object[] newArr = new Object[size];
        System.arraycopy(arr, 0, newArr, 0, length);
        arr = newArr;
    }
}
