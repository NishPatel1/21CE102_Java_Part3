public class Part33Impl implements Part33P12 {
    @Override
    public void add() {
        // TODO Auto-generated method stub
        int ans = a+b+c+d;
        System.out.println("The addition of " + a + ", " + b + ", " + c + " and " + d + " is " + ans);
    }

    @Override
    public void sub() {
        // TODO Auto-generated method stub
        int ans = a-b-c-d;
        System.out.println("The subtraction of " + a + ", " + b + ", " + c + " and " + d + " is " + ans);
    }

    @Override
    public void mul() {
        // TODO Auto-generated method stub
        int ans = a*b*c*d;
        System.out.println("The multiplication of " + a + ", " + b + ", " + c + " and " + d + " is " + ans);
    }

    @Override
    public void div() {
        // TODO Auto-generated method stub
        float ans = a/d;
        System.out.println("The division of " + a + " and "+ b + " is " + ans);
    }
}
