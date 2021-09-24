import java.util.Scanner;

public class DateClass implements Cloneable {
    private int month;
    private int day;
    private int year;
    private boolean isLeapYear;

    DateClass(){
        month = 1;
        day = 1;
        year = 2000;
    }
    DateClass(int m, int d, int y){
        verifyDate(m,d,y);
    }

    // get
    public String getDate(){
        return (month + "/" + day + "/" + year);
    }

    // set
    public void setDate(int m, int d, int y){
        verifyDate(m,d,y);
    }

    @Override
    public Object clone() {
        DateClass dateClone = new DateClass(month, day, year);
        return dateClone;
    }

    // other methods
    public void verifyDate(int m, int d, int y) {
        computeLeapYear(y);
        Scanner input = new Scanner(System.in);

        while(y <= 0){
            System.out.print("Enter year greater than 0: ");
            y = input.nextInt();
            computeLeapYear(y);
        }

        while(m <= 0 || m > 12){
            System.out.print("Enter month greater than 0 but less than or equal to 12: ");
            m = input.nextInt();
        }

        while (d <= 0 || day > 31) {
            System.out.print("Enter day greater than 0 but less than or equal to 31: ");
            d = input.nextInt();
        }

        // if day is 31 and not in any month with 31 days... do again
        while (d == 31 && (m == 2 || m == 4 || m == 6 || m == 7 || m == 9 || m == 11) ) {
            System.out.print("Enter a day that is valid for month " + month + ": ");
            d = input.nextInt();
        }

        // if month is Feb and day is 29 and not in non leap year... do again
        while (m == 2 && d == 29 && !isLeapYear) {
            System.out.print("Enter a day that is valid for Feb on non-leap years: ");
            d = input.nextInt();
        }

        month = m;
        day = d;
        year = y;
    }
    public void computeLeapYear(int y){
        if(( (y % 400 == 0) || (year % 4 == 0) ) && (year % 100 != 0))
            isLeapYear = true;
        else
            isLeapYear = false;
    }
    public void display(){
        System.out.println("Date: " + month + "/" + day + "/" + year);
    }
}
