package com.bridgelabz.employeewage;


public class EmpWage {
//    static final int FULL_DAY_HOUR = 8;
//    static final int PART_DAY_HOUR = 4;
//    static final int wagePerHour = 20;
//    static final int totalWorkingDays = 20;
//    static final int TOTAL_WORKING_HOUR = 100;

    public  void employeeWage(int fullDayHour,int partDayHour,int wagePerHour,int totalWorkingDays,int totalWorkingHour){

        int day = 1;
        int workingHour=0;
        int totalWage=0;

        while (day <= totalWorkingDays && workingHour < totalWorkingHour) {
            int dayWage = 0;
            System.out.print(day +" day");
            int isPresent = (int) (Math.random() * 10 % 3);
            switch (isPresent) {
                case 1 : {
                    dayWage = partDayHour * wagePerHour;
                    // System.out.println("part time");
                    workingHour = workingHour + partDayHour;
                }
                case 2 : {
                    dayWage = fullDayHour * wagePerHour;
                    // System.out.println("full time");
                    workingHour += fullDayHour;
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
        EmpWage company1 = new EmpWage();
        System.out.println("For company one : ");
        company1.employeeWage(8,4,20,25,100);
        System.out.println();
        System.out.println("For company two : ");
       EmpWage company2 = new EmpWage();
        company2.employeeWage(12,6,15,20,100);


    }
}

