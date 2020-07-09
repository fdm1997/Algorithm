package stack_and_queue.fifve;

import java.util.Stack;

/**
 * @Author fdm
 * @Date 2020/7/9 17:24
 * @description：
 */
public class StackSort {

    public void sort(Stack<Integer> stackData){
        Stack<Integer> stackHelp = new Stack<Integer>();
        while (!stackData.isEmpty()){
            Integer tmp = stackData.pop();
            while (!stackHelp.isEmpty()&&stackHelp.peek()>tmp){
                stackData.push(stackHelp.pop());
            }
            stackHelp.push(tmp);
        }
        while (!stackHelp.isEmpty()){
            stackData.push(stackHelp.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(3);
        stack.push(4);
        stack.push(2);
        stack.push(5);
        StackSort stackSort = new StackSort();
        stackSort.sort(stack);
        System.out.println(stack);
    }
}
