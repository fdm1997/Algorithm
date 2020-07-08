package stack_and_queue.three;

import java.util.Stack;

/**
 * @Author fdm
 * @Date 2020/7/8 11:17
 * @description：
 */
public class RecursionAndStack {
    public static void main(String[] args) {
        Stack<Integer> stackData = new Stack<Integer>();
        Stack<Integer> stackTmp = new Stack<Integer>();
        stackData.push(1);
        stackData.push(2);
        stackData.push(3);
        stackData.push(4);
        stackData.push(5);

/*        RecursionAndStack stack = new RecursionAndStack();
        stack.re(stackData);*/

        System.out.println(stackData.pop());
        System.out.println(stackData.pop());
        System.out.println(stackData.pop());
        System.out.println(stackData.pop());
        System.out.println(stackData.pop());

    }

    public void Recursion(Stack data,Stack tmp){
        if (data.isEmpty()) return;
        tmp.push(data.pop());
        Recursion(data,tmp);
    }
    /*public void re(Stack data){
        if (data.isEmpty()) return ;
        Integer fr = fr(data);
        data.push(fr);
    }
    public Integer fr(Stack<Integer> data){
        Integer res = data.pop();
        if (!data.isEmpty()){
            res = fr(data);
        }
        return res;
    }*/
}
