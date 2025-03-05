public class J01Swapping {
    // Approach 1: Swapping the Values Using Third Variable
    public static void usingtemp(int num1, int num2) {
        System.out.println("Before swapping:- num1:- " + num1 + "  num2:- " + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping:- num1:- " + num1 + "  num2:- " + num2);
    }

    public static void main(String args[]) {
        int num1 = 5;
        int num2 = 10;
        usingtemp(num1, num2);
    }
}
