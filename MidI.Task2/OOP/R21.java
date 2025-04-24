package OOP;

import OOP.sub.A21;


public class R21 {
    public static void main(String[] args) {
        // 1. Create instances
        A21 rectangle = new A21();
        A22 monthInfo = new A22();

        // 2. Print rectangle area
        int area = rectangle.getWidth() * rectangle.getHeight();
        System.out.println("Rectangle area: " + area);

        // 3. Print month name with validation
        printMonthName(monthInfo.getMonth());
    }

    private static void printMonthName(int monthNumber) {
        String monthName;
        switch(monthNumber) {
            case 1:  monthName = "January"; break;
            case 2:  monthName = "February"; break;
            case 3:  monthName = "March"; break;
            case 4:  monthName = "April"; break;
            case 5:  monthName = "May"; break;
            case 6:  monthName = "June"; break;
            case 7:  monthName = "July"; break;
            case 8:  monthName = "August"; break;
            case 9:  monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December"; break;
            default: monthName = "Invalid month number! Must be 1-12";
        }

        System.out.println("Month: " + monthName);
    }
}
