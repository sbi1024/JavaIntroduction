package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요 : ");
        String str = scanner.nextLine(); // 입력을 String 으로 가져온다.
        System.out.println("입력한 문자열: " + str);

        System.out.print("정수를 입력하세요 : ");
        int intValue = scanner.nextInt(); // 입력을 int 으로 가져온다.
        System.out.println("입력한 정수: " + intValue);

        System.out.print("실수를 입력하세요 : ");
        double doubleValue = scanner.nextDouble(); // 입력을 double 으로 가져온다.
        System.out.println("입력한 실수: " + doubleValue);

        // print() 출력하고 다음 라인으로 넘어가지 않는다.
        // println() 출력하고 다음 라인으로 넘어간다.
    }
}
