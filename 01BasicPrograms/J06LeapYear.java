public class J06LeapYear {
    public static void usingNested(int year) {
        boolean isLeapYear = false;
        if (year % 400 == 100) {
            isLeapYear = true;
        }
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                isLeapYear = true;
            } else {
                isLeapYear = false;
            }
        }

        if (isLeapYear) {
            System.out.println(year + ": Leap Year.");
        } else {
            System.out.println(year + ": Not a leap year.");
        }
    }

    public static void main(String args[]) {
        usingNested(1900);
        usingNested(2012);
    }
}
