package Aula3;

public class Unboxing {
    public static void main(String[] args) {
        int x = 20;
        Object obj = x;
        int y = (int) obj;
        System.out.println(y);
    }
}
