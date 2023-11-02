package test.demo;

/**
 * @Author hongxiaobin
 * @Time 2023/3/11-15:21
 */
public class Test {
    public static void main(String[] args) {
        Object o1 = false ? new Double(2.0) : new Integer(1);
        Object o2;
        if (true) {
            o2= new Integer(1);
        }else {
            o2=new Double(2.0);
        }
        System.out.println(o1);
        System.out.println(" ");
        System.out.println(o2);
    }
}
