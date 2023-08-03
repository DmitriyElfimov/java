package Homework004;

public class Fruct {
    public static Object name;
    private static int counter;
    private final int no;{
        no = ++counter;
    }

    public int getNo() {
        return no;
    }

    @Override
    public String toString() {
        return String.format("фрукт #%d ", no );
    }
}
