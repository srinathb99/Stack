package stacksRepo;

public class StackDemo {
	public static void main(String[] args) {
		Stack_array S=new Stack_array();
		S.push(1);
		S.push(2);
		S.push(34);
		System.out.println("Current stack is");
		S.printStack();
		System.out.println("The top element is "+S.top());
		System.out.println("Size of stack is "+S.size());
	}
}
