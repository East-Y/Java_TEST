package Java_05;

public class CondOp {
    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 100;
        int big;
        int diff;

        // big = (num1 > num2) ? num1 : num2;
        // System.out.println("큰 수: " + big);

        if (num1 > num2) {
            big = num1;
            System.out.println(big);
        } else {
            big = num2;
            System.out.println(big);
        }

        // diff = (num1 > num2) ? (num1 - num2) : (num2 - num1);
        // System.out.println("절댓값: "+ diff);

        if (num1 > num2) {
            diff = num1 - num2;
            System.out.println(diff);
        } else {
            diff = num2 - num1;
            System.out.println(diff);
        }
    }
}
