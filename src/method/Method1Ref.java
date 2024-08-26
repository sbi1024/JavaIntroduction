package method;

public class Method1Ref {
    public static void main(String[] args) {
        //계산1
        int sum1 = add(5, 10);
        System.out.println("결과1 출력: " + sum1);

        //계산2
        int sum2 = add(15, 20);
        System.out.println("결과2 출력:" + sum2);
    }

    // 메서드 선언에 사용하는 변수를 영어로 파라미터, 한글로 매개변수 라고 한다.
    public static int add(int a, int b) {
        System.out.println(a + "+" + b + " 연산 수행");
        int sum = a + b;
        return sum;
    }
}
