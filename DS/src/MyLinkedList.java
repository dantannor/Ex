public class MyLinkedList<T>{

    private Node<T> head;

    public MyLinkedList() {
        this.head = new Node<T>(null);
    }

    public void add(T data){
        Node tmp = new Node(data);
        Node cur = head;

        while(cur.next != null){
            cur = cur.next;
        }

        cur.next = tmp;
    }

    public void add(T data, int index){
        Node cur = head;
        Node temp = new Node(data);

        for (int i = 1; i<index && cur.next != null; i++){
            cur = cur.next;
        }

        temp.next = cur.next;
        cur.next = temp;
    }
    
    public T get(int index){
        Node cur = head;

        for (int i = 0; i < index; i++) {
            if(cur.next == null)
                return null;
            cur = cur.next;
        }

        return (T)cur.data;
    }

    public T remove(int index){
        Node cur = head;
        Node prev = cur;

        for (int i = 0; i < index; i++) {
            if(cur.next == null)
                throw new IndexOutOfBoundsException();

            prev = cur;
            cur = cur.next;
        }

        // when i set cur.next to null, does it make prev null also?
        prev.next = cur.next;
        T res = (T)cur.data;

        return res;
    }

    public class Node<T>{
        public T data;
        public Node<T> next;

        public Node(T data){
            this.data = data;
        }
    }
}

