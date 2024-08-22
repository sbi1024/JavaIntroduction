package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        // 전위 증감 연산자 사용 예
        int a = 1;
        int b = 0;

        b = ++a;
        System.out.println("a = " + a + ", b = " + b);

        a = 1;
        b = 0;

        b = a++; // a의 현재값을 b에 대입하고, 그 후 a값을 증가시킴
        System.out.println("a = " + a + ", b = " + b);

        ++a;
        System.out.println("a = " + a);
        a++;
        System.out.println("a = " + a);
    }
}
