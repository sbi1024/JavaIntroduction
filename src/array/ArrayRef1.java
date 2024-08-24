package array;

public class ArrayRef1 {
    public static void main(String[] args) {
        int[] students; // 배열변수 선언
        students = new int[5];

        students[0] = 100;
        students[1] = 90;
        students[2] = 80;
        students[3] = 70;
        students[4] = 60;

        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + "의 점수 : " + students[i]);
        }
    }
}
