package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        intValue = (int) doubleValue; // 명시적 형변환을 해야함
        System.out.println("intValue = " + intValue);
    }
}
