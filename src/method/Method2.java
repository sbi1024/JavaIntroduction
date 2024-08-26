package method;

public class Method2 {
    // return 을 만나면 해당 메소드는 종료된다.
    public static void main(String[] args) {
        printHeader();
        System.out.println(" 프로그램이 동작합니다. ");
        printFooter();
    }

    // void 는 메소드 마지막에 return 을 자동을 넣어준다
    public static void printHeader() {
        System.out.println("= 프로그램을 시작합니다 =");
    }

    public static void printFooter() {
        System.out.println("= 프로그램을 종료합니다 =");
    }
}
