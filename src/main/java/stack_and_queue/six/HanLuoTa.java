package stack_and_queue.six;

import java.util.Stack;

/**
 * @Author fdm
 * @Date 2020/7/10 17:28
 * @description：
 */
public class HanLuoTa {

    private Stack<Integer> left;
    private Stack<Integer> center;
    private Stack<Integer> right;

    public static void main(String[] args) {
        Stack<Integer> left = new Stack<Integer>();
        Stack<Integer> center = new Stack<Integer>();
        Stack<Integer> right = new Stack<Integer>();
        left.push(5);
        left.push(2);
        left.push(3);
        left.push(1);
        left.push(4);

        while (!left.isEmpty()){
            if (center.isEmpty()){
                System.out.println("left -> center,v:"+left.peek());
                center.push(left.pop());
                continue;
            }
            while (!center.isEmpty()&&center.peek()< left.peek()){
                System.out.println("center -> right,v:"+center.peek());
                right.push(center.pop());
            }
            System.out.println("left -> center,v:"+left.peek());
            center.push(left.pop());
            while (!right.isEmpty()){
                System.out.println("right -> center,v:"+right.peek());
                center.push(right.pop());
            }

        }

        while (!center.isEmpty()){
            right.push(center.pop());
        }

        System.out.println(right);
    }
}
