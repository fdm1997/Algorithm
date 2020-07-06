package stack_and_queue.one;

import java.util.Stack;

/**
 * @Author: 付道明
 * @DATE: 2020/7/7 0:11
 * @DESCRIBE:
 **/
public class Stack2 {

    private Stack<Integer> stackData;
    private  Stack<Integer> stackMin;

    public Stack2() {
        this.stackData = new Stack<Integer>();
        this.stackMin = new Stack<Integer>();
    }

    public void push(Integer i){
        if (stackMin.isEmpty()){
            stackMin.push(i);
        }else {
            Integer val = stackMin.peek();
            if (i>val){
                stackMin.push(val);
            }else {
                stackMin.push(i);
            }
        }
        stackData.push(i);
    }

    public Integer pop(){
        if(!stackMin.isEmpty()){
            stackMin.pop();
        }else{
            throw new RuntimeException("栈为空");
        }
       if (!stackMin.isEmpty()){
           return stackData.pop();
       }else {
           throw new RuntimeException("栈为空");
       }

    }

    public Integer getMin(){
        if (stackMin.isEmpty()){
            throw new RuntimeException("栈为空");
        }
        return stackMin.peek();
    }


    public static void main(String[] args) {
        Stack2 stack1 = new Stack2();
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
