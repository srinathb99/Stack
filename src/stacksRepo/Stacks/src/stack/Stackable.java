package stack;

public interface Stackable<E> {
	int size();
	void push(E e);
	E pop();
	E top();
	void printStack();
	boolean isEmpty();	
}
