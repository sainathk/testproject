package Collections;

import java.util.Stack;

public class stack_list 
{

	static void push(Stack<Integer> stack)
	{
		 for(int i = 0; i < 5; i++) 
	        { 
	            stack.push(i); 
	        }
	}
	static void pop(Stack<Integer> stack)
	{
		System.out.println("Pop:");
		 for(int i = 0; i < 5; i++) 
	        { 
	            Integer y = (Integer) stack.pop(); 
	            System.out.println(y); 
	        }
	}
	static void peek(Stack<Integer> stack) 
    { 
        Integer element = (Integer) stack.peek(); 
        System.out.println("Element on stack top : " + element); 
    } 
	
	public static void main(String[] args) 
	{
		Stack<Integer> stack = new Stack<Integer>();
		push(stack);
		pop(stack);
		push(stack);
		peek(stack);

	}

}
