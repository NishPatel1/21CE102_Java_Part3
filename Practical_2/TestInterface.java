import java.util.*;

public class TestInterface implements IScanner, IPrinter {

    private int a;
    private int b;
    
    @Override
    public void getdata() {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a = sc.nextInt();
        System.out.print("Enter the second number: ");
        b = sc.nextInt();
    }

    @Override
    public int sub() {
        // TODO Auto-generated method stub
        return a-b;
    }

    @Override
    public void putdata() {
        // TODO Auto-generated method stub
        System.out.println("Subtraction of " + a + " and " + b + " is " + sub());
        System.out.println("Addition of " + a + " and " + b + " is " + add(a,b));
    }
}
