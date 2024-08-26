package method;

public class MethodCasting2 {

    public static void main(String[] args) {
        int number = 100;
        printNumber(100);
    }

    // 자동형변환 작은범위에서, 큰범위로 값 대입은 명시적으로 캐스팅 하지 않아도
    // 자동형변환이 진행된다.
    public static void printNumber(double n) {
        System.out.println("숫자: " + n);
    }
}
