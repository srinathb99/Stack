package stack;

public class Stack<E> implements Stackable<E> {
	private int t=-1;
	public final static int CAPACITY=20;
	private E[] data;
	public String StackName;
	public Stack()
	{
		data=(E[])new Object[CAPACITY];
	}
	public Stack(int n)
	{
		data=(E[])new Object[n];
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return t+1;
	}

	@Override
	public void push(E e) {
		// TODO Auto-generated method stub
		if(t+1==CAPACITY)
		{
			System.out.println("Stack Full Exception");
		}
		else
		{
			t+=1;
			data[t]=e;
		}	
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		if(t+1==0)
		{
			System.out.println("Stack Empty Exception");
			return null;
		}
		else
		{
			E ans=data[t];
			data[t]=null;
			t-=1;
			
			return ans;
		}
	}

	@Override
	public E top() {
		// TODO Auto-generated method stubif(t+1==0)
		if(t+1==0)
		{
			System.out.println("Stack Empty Exception");
			return data[t];
		}
		else
		{
			return data[t];
		}
	}

	@Override
	public void printStack() {
		// TODO Auto-generated method stub
		int i;
		for(i=t;i>=0;--i)
		{
			System.out.println(data[i]);
		}
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return t==-1;
	}
	public E getMid() {
		// TODO Auto-generated method stub
		int Size=size();
		int n,i,j=0;
		E answer;
		if(Size%2==1)
		   { 
		       n=(Size/2)+1;
		        E[] a;
		    a=(E[])new Object[n];
		    for(i=0;i<n;++i,++j)
		    {
		        a[j]=pop();
		        
		    }
		    answer=a[n-1];
		    for(i=n-1;i>=0;--i)
		    {
		        push(a[i]);
		    }
		   }
		   else
		   {
		       n=(Size/2)+1;
		       
		    E[] a;
		    
		    a=(E[])new Object[n];
		    for(i=0;i<n;++i)
		    {
		        a[j]=pop();
		        ++j;
		    }
		   answer=a[n-1];
		    for(i=n-1;i>=0;--i)
		    {
		        push(a[i]);
		    }
		   }
        return answer;
}
	public String stackName(int n)
	{
		if(n==1)
		{
			StackName="A";
		}
		else if(n==2)
		{
			StackName="B";
		}
		else if(n==3)
		{
			StackName="C";
		}
		return StackName;
	}
	
}


