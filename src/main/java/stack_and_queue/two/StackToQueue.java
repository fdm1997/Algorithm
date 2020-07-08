package stack_and_queue.two;

import java.util.Stack;

/**
 * @Author fdm
 * @Date 2020/7/8 10:25
 * @description：
 */
public class StackToQueue {

    private Stack<Integer> stackPush;
    private Stack<Integer> stackPop;

    public StackToQueue(){
        this.stackPush = new Stack<Integer>();
        this.stackPop = new Stack<Integer>();

    }

    public void add(Integer i){
        stackPush.push(i);
    }

    public Integer poll(){

        peek();
        return stackPop.pop();
    }

    public Integer peek(){
        if (stackPush.isEmpty()&&stackPop.isEmpty()){
            throw new RuntimeException("栈为空");
        }
        if (stackPop.isEmpty()) {
            while (!stackPush.isEmpty()) {
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.peek();
    }


    public static void main(String[] args) {
        StackToQueue stackToQueue = new StackToQueue();
        stackToQueue.add(1);
        stackToQueue.add(2);
        stackToQueue.peek();
        stackToQueue.add(3);
        stackToQueue.add(4);
        stackToQueue.add(5);
        System.out.println(stackToQueue.poll());
        System.out.println(stackToQueue.poll());
        System.out.println(stackToQueue.poll());
        System.out.println(stackToQueue.poll());
        System.out.println(stackToQueue.poll());
        System.out.println(stackToQueue.poll());
    }
}
