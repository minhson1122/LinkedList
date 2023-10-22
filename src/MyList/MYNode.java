package MyList;

public class MYNode<E> {
    public E data;
    public MYNode<E> link = null;

    public MYNode(E data){
        this.data = data;
    }
}
