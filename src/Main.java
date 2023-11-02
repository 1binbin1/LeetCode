

public class Main {
    public static void main(String[] args) {
        int a = 5,c;
        c = g(a);
        System.out.println(a+c);
    }
    private static int g(int x){
        int m = 2;
        m = x*m;
        x = m-1;
        return x + m;
    }
}