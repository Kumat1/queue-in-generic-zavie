import java.lang.reflect.Array;

/**
 * Created by Firza Rinandha NST on 4/3/2017.
 */
public class Queue <T> {
    public T[] array;
    public int pointer, tail;

    public Queue(Class<?> classname){
        array =(T[]) Array.newInstance(classname,10);
        pointer = -1;
        tail = 0;
    }

    public static void main(String[]args){
        Queue<Integer> T = new Queue<Integer>(Integer.class);
        T.enqueue(8);
        T.enqueue(18);
        T.enqueue(38);
        T.enqueue(28);
        System.out.println(T.dequeue());
        System.out.println(T.dequeue());
        System.out.println(T.dequeue());
        System.out.println(T.dequeue());
    }

    public void enqueue(T item){
        array[++pointer]=item;
    }

    public T dequeue(){
        return array[tail++];
    }
}
