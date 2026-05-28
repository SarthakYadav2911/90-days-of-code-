public class Leetcode225 {
    private int[] stack;
    private int top;

    public Leetcode225() {
        stack = new int[10000]; 
    top = -1;
    }
    
    public void push(int x) {
        if (top >= stack.length - 1) {
        return;
    }
    top = top + 1;
    stack[top] = x;
        
    }
    
    public int pop() {
        if (top == -1) {
        return -1; 
    }
    int poppedValue = stack[top];
    top = top - 1;
    return poppedValue;
        
    }
    
    public int top() {
        if (top == -1) {
        return -1;
    }
    return stack[top];
        
    }
    
    public boolean empty() {
        return top == -1;
    }
    public static void main(String [] args)
    {

        Leetcode225 obj = new Leetcode225();
        
        System.out.println("pushing numbers like 10,20,30 in stack");
        obj.push(10);
        obj.push(20);
        obj.push(30);


        System.out.println("item at the top: "+ obj.top());

        System.out.println("Item be poppd :"+ obj.pop());

        System.out.println("IS stack empty? :" + obj.empty());

    }
}
    

