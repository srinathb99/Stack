package stack;
import java.util.*;
public class StackDemo {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of disks:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		Stack A=new Stack(num);
		Stack B=new Stack(num);
		Stack C=new Stack(num);
		TowerOfHanoi Hanoi=new TowerOfHanoi(A,B,C,num);
		Hanoi.MoveDisk(num, A, C, B);
		System.out.println("This is the destination rod");
		Hanoi.display(C);
	}
}
