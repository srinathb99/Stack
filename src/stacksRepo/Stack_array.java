package stacksRepo;

public class Stack_array<E> implements Stack<E> {

	public static final int CAPACITY=20;
	private int t=-1;
	private E[] data;
	public Stack_array()
	{
		data=(E[])new Object[CAPACITY];
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return t+1;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return t==-1;
	}

	@Override
	public void push(E e) {
		// TODO Auto-generated method stub
		if(t+1==CAPACITY)
		{
			System.out.println("Stack Full Exception");
		}
		t+=1;
		data[t]=e;
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		if(isEmpty())
		{
			System.out.println("Stack Empty Exception");
		}
		t-=1;
		return data[t];
	}

	@Override
	public E top() {
		// TODO Auto-generated method stub
		if(isEmpty())
		{
			System.out.println("Stack Empty Exception");
		}
		return data[t];
	}

	@Override
	public void printStack() {
		// TODO Auto-generated method stub
		int i;
		for(i=0;i<=t;++i)
		{
			System.out.println(data[i]);
		}
		
	}
}
