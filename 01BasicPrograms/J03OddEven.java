public class J03OddEven {
    // Brute Force Naive Approach
    public static void usingifelse(int num) {
        if (num % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }

    public static void main(String args[]) {
        usingifelse(10);
    }
}
