package com.bridgelabz.employeewage;


public class EmpWage {
    static final int FULL_DAY_HOUR = 8;
    static final int PART_DAY_HOUR = 4;
    static final int WAGE_PER_HOUR = 20;
    static final int TOTAL_WORKING_DAYS = 20;
    static final int TOTAL_WORKING_HOUR = 100;

    public  void employeeWage(){


        int day = 1;
        int workingHour=0;
        int totalWage=0;

        while (day <= TOTAL_WORKING_DAYS && workingHour < TOTAL_WORKING_HOUR) {
            int dayWage = 0;
            System.out.print(day +" day");
            int isPresent = (int) (Math.random() * 10 % 3);
            switch (isPresent) {
                case 1 : {
                    dayWage = PART_DAY_HOUR * WAGE_PER_HOUR;
                   // System.out.println("part time");
                    workingHour = workingHour + PART_DAY_HOUR;
                }
                case 2 : {
                    dayWage = FULL_DAY_HOUR * WAGE_PER_HOUR;
                   // System.out.println("full time");
                    workingHour += FULL_DAY_HOUR;
                }
                default : //System.out.println("absent");
            }
            if (workingHour>100){
                workingHour=100;
            }
            totalWage=totalWage+dayWage;
            System.out.print(" total working hour is "+workingHour);
            System.out.print( " and current day wage is "+ dayWage);
            System.out.println();

            day++;


        }
        System.out.println("total wage is " +totalWage );
    }

    public static void main(String[] args) {
EmpWage obj = new EmpWage();
obj.employeeWage();

    }
}

