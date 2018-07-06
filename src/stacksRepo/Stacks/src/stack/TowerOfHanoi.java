package stack;

public class TowerOfHanoi {
	String SrcId;
	String DestId;
	TowerOfHanoi(Stack SRC, Stack DEST, Stack AUX, int n){
		SRC.stackName(1);
		DEST.stackName(2);
		AUX.stackName(3);
		for(int i=n;i>0;--i)
		{
			SRC.push(i);
		}
		System.out.println("This is the Source Rod");
		SRC.printStack();
	}

	public void MoveDisk(int n,Stack SRC, Stack DEST, Stack AUX)
	{
		if(n>0)
		{

			MoveDisk(n-1,SRC,AUX,DEST);
			DEST.push(SRC.pop());
			System.out.println("Move disk "+n+" from "+SRC.StackName+" to "+DEST.StackName);
			MoveDisk(n-1,AUX,DEST,SRC);
		}
	}
	public void display(Stack Final)
	{
		Final.printStack();
	}
}
