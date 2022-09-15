package P1;
import java.util.*;

public class UserDefinedPack{

	Scanner sc = new Scanner(System.in);
	private int a;
	private int b;

	public void getdata(){
		a = sc.nextInt();
		b = sc.nextInt();
	}
	public int add(){
		return a+b;
	}

	public static void sub(int a, int b){
		int ans = a-b;
		System.out.println("Subtraction of " + a + " and " + b + " is " + ans);
	}
}