import java.util.Scanner;

public class date64{
    public static void main(String[] args) {
        DATE date = new DATE();
        date.setDate();
        date.evaluateDate();
    }
}

class DATE{
    private int year;
    private int month;

    public int getYear(){
        return year;
    }

    public int getMonth(){
        return month;
    }

    public int checkLeapYear(int v){
        if(v % 4 == 0){
            if(v % 100 == 0){
                if(v % 400 != 0) return -1;
                else return 1;
            }
            return 1;
        }
        return -1;
    }

    public void setDate(){
        String m;
        System.out.println("Enter a month");
        Scanner sc = new Scanner(System.in);
        int check = 0;
        while(check == 0){
            m = sc.nextLine();
            if(m.equals("January") == true || m.equals("Jan") == true || m.equals("Jan.") == true || m.equals("1") == true){
                month = 1;
                check = 1;
            }
            else if(m.equals("Febuary") == true || m.equals("Feb") == true || m.equals("Feb.") == true || m.equals("2") == true){
                month = 2;
                check = 1;
            }
            else if(m.equals("March") == true || m.equals("Mar") == true || m.equals("Mar.") == true || m.equals("3") == true){
                month = 3;
                check = 1;
            }
            else if(m.equals("April") == true || m.equals("Apr") == true || m.equals("Jan.") == true || m.equals("4") == true){
                month = 4;
                check = 1;
            }
            else if(m.equals("May") == true || m.equals("5") == true){
                month = 5;
                check = 1;
            }   
            else if(m.equals("June") == true || m.equals("Jun") == true || m.equals("6") == true){
                month = 6;
                check = 1;
            }
            else if(m.equals("July") == true || m.equals("Jul") == true || m.equals("7") == true){
                month = 7;
                check = 1;
            }
            else if(m.equals("August") == true || m.equals("Aug") == true || m.equals("Aug.") == true || m.equals("8") == true){
                month = 8;
                check = 1;
            }
            else if(m.equals("September") == true || m.equals("Sep") == true || m.equals("Sep.") == true || m.equals("9") == true){
                month = 9;
                check = 1;
            }
            else if(m.equals("October") == true || m.equals("Oct") == true || m.equals("Oct.") == true || m.equals("10") == true){
                month = 10;
                check = 1;
            }   
            else if(m.equals("November") == true || m.equals("Nov") == true || m.equals("Nov.") == true || m.equals("11") == true){
                month = 11;
                check = 1;
            }
            else if(m.equals("December") == true || m.equals("Dec") == true || m.equals("Dec.") == true || m.equals("12") == true){
                month = 12;
                check = 1;
            }
            else{
                System.out.println("Invalid month! Enter again: ");
            }
        }
        
        int y;
        System.out.println("Enter a year");
        y = sc.nextInt();
        while(y < 1000 || y > 3000){
            System.out.println("Invalid year! Enter again: ");
            y = sc.nextInt();
        }
        year = y;

        sc.close();
    }

    public void evaluateDate(){
        if(month == 1 || month == 3 || month == 5 || month == 7 ||  month == 8 || month == 10 || month == 12){
            System.out.println("number of days: 31");
        }
        else if(month == 4 || month == 6 || month == 9 || month == 11){
            System.out.println("number of days: 30");
        }
        else if(month ==2){
            if(checkLeapYear(year) == 1){
                System.out.println("number of days: 29");
            }
            else{
                System.out.println("number of days: 28");
            }
        }
    }
}
