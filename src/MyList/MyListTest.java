package MyList;

import java.util.Arrays;

public class MyListTest<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object element[];

    public MyListTest(){
        element = new Object[DEFAULT_CAPACITY];
    }
    public void ensureCapa(){
        int newSize = element.length * 2;
        element = Arrays.copyOf(element, newSize);
    }
    public void add(E e){
        element[size++] = e;
        if (size == element.length){
            ensureCapa();
        }
    }
    public E get(int i){
        if (i >= size || size < 0){
            System.out.println("illegal\n");
        }
        return (E) element[i];
    }

    public static void main(String[] args) {
        MyListTest<Integer> myListInterger1 = new MyListTest<Integer>();
        myListInterger1.add(5);
        myListInterger1.add(7);
        myListInterger1.add(4);
        myListInterger1.add(6);
        myListInterger1.add(9);


        System.out.println(myListInterger1.get(3));
//        System.out.println(myListInterger1.get(-1));
    }
}
