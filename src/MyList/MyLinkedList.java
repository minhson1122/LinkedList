package MyList;

public class MyLinkedList<E> {
    public MYNode<E> head = null;
    public MYNode<E> tail = null;

    public int size = 0;

    public void inserFirstNode(E data) {
        MYNode<E> node = new MYNode<>(data);
        if (this.head == null){
            this.head = node;
            this.tail = node;
        }else {
            node.link = this.head;
            this.head = node;
        }
        this.size++;
    }
    public void readList(){
        MYNode<E> currenNode = this.head;
        while(currenNode != null){
            System.out.println(currenNode.data);
            currenNode = currenNode.link;
        }
    }
    public void inserLastNode(E data){
        MYNode<E> node = new MYNode<>(data);
        if (this.tail == null){
            this.head = node;
            this.tail = node;
        }else {
            this.tail.link = node;
            this.tail = node;
        }
    }
    public void remove(int index){
        int i  = 0;
        MYNode<E> p = this.head;
        MYNode<E> c = this.tail;

        while (i < index){
        p = c;
        c = c.link;
        i++;
        }
        p.link = c.link;
        size--;
    }
    public void insert(E data, int index) {
        MYNode<E> node = new MYNode<E>(data);
        int i = 0;
        MYNode<E> p = this.head;
        MYNode<E> c = this.tail;

        while (i < index) {
            p = c;
            c = c.link;
            i++;
        }
        p.link = node;
        node.link = c;
        size++;
    }
}
