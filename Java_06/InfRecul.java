package Java_06;

public class InfRecul {
    public static void main(String[] args) {
        showHi(3);
    }

    public static void showHi(int cnt) {
        System.out.println("Hi~ ");
        if (cnt == 1) {
            return;
        }
        // showHi(cnt--);
        showHi(--cnt);
    }
}
