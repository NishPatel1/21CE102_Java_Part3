public interface IPrinter {
    default int add(int a, int b)
    {
        return a+b;
    }

    public int sub();

    public void putdata();
}
