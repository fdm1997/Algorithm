package stack_and_queue.one;

import java.util.Stack;

/**
 * @Author: 付道明
 * @DATE: 2020/7/6 23:57
 * @DESCRIBE:
 **/
public class Stack1 {

    private  Stack<Integer> stackData;
    private  Stack<Integer> stackMin;

    public Stack1() {
        this.stackData = new Stack<Integer>();
        this.stackMin = new Stack<Integer>();
    }

    public void push(Integer i){
        if (stackMin.empty()){
            stackMin.push(i);
        }else {
            if (i <= stackMin.peek()){
                stackMin.push(i);
            }
        }
        stackData.push(i);
    }

    public Integer pop(){

        int val = stackData.pop();
        if (val == getMin()){
            stackMin.pop();
        }

        return val;
    }

    public Integer getMin(){
        if (stackMin.isEmpty()){
            throw new RuntimeException("栈为空");
        }

        return stackMin.peek();
    }

    public static void main(String[] args) {
        Stack1 stack1 = new Stack1();
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);
        stack1.push(1);
        stack1.push(1);
        stack1.push(2);

        System.out.println("当前最小值："+stack1.getMin());
        stack1.pop();
        System.out.println("弹出一个元素后，当前最小值："+stack1.getMin());
        stack1.pop();
        System.out.println("弹出两个个元素后，当前最小值："+stack1.getMin());
        stack1.pop();
        System.out.println("弹出三个元素后，当前最小值："+stack1.getMin());

    }
}
