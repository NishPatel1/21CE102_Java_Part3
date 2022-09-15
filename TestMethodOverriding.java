public class TestMethodOverriding {
    public static void main(String[] args) {
        MethodOverridingParent m1 = new MethodOverridingParent();
        MethodOverridingChild m2 = new MethodOverridingChild();
        System.out.println("sample method in MethodOverridingParent: ");
        m1.sample();
        System.out.println("\nsample method in MethodOverridingChild: ");
        m2.sample();
    }
}
