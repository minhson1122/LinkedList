import MyList.MyLinkedList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> mylist = new MyLinkedList<>();
        mylist.inserFirstNode(1);
        mylist.inserFirstNode(2);
        mylist.inserFirstNode(3);
        mylist.inserFirstNode(4);
        mylist.readList();

    }
}