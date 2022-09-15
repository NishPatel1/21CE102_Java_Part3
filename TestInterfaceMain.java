import java.util.*;

public class TestInterfaceMain {
    public static void main(String[] args) {
        Vector<TestInterface> ti = new Vector<TestInterface>(5);
        for(int i=0;i<5;i++)
        {
            TestInterface a = new TestInterface();
            ti.add(a);
        }
        for(int i=0;i<5;i++){
            System.out.println("For object at index " + i + ": ");
            ti.get(i).getdata();
            ti.get(i).putdata();
            System.out.println();
        }
    }
}
