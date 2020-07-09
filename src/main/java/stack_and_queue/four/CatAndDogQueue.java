package stack_and_queue.four;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * @Author fdm
 * @Date 2020/7/8 16:31
 * @description：
 */
public class CatAndDogQueue {

    private Queue<Dog> queue;

    private Queue<Cat> queue1;

    private int type =1;

    private int tag = 1;

    public CatAndDogQueue() {
        this.queue = new ConcurrentLinkedQueue<Dog>();
        this.queue1 = new ConcurrentLinkedQueue<Cat>();
    }

    public void add(Object obj){
        if (obj instanceof Dog){
            if (queue.isEmpty()&&queue1.isEmpty()) {
                type = 1;
            }
            queue.add((Dog) obj);
        }else if (obj instanceof Cat){
            if (queue.isEmpty()&&queue1.isEmpty()) {
                type = 2;
            }
//            queue1.add()
        }

    }

  /*  public Object pollAll(){

    }

    public E pollDog(){

    }

    public T pollCat(){

    }

    public boolean isEmpty(){

    }

    public boolean isEmptyDog(){

    }

    public boolean isEmptyCat(){

    }*/

}
