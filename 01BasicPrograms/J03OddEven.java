public class J03OddEven {
    // Brute Force Naive Approach
    public static void usingifelse(int num) {
        if (num % 2 == 0) {
            System.out.println(num + ": Even Number");
        } else {
            System.out.println(num + ": Odd Number");
        }
    }

    // Using Bitwise OR
    public static void usingBitwiseOR(int num) {
        if ((num | 1) > num) {
            System.out.println(num + ": Even Number");
        } else {
            System.out.println(num + ": Odd Number");
        }
    }

    public static void main(String args[]) {
        usingifelse(10);
        usingBitwiseOR(13);
    }
}
