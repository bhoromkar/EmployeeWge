package com.bridgelabz.employeewage;


public class EmpWage {
      int fullDayHour;
      int partDayHour;
      int wagePerHour;
      int totalWorkingDays;
      int totalWorkingHour;

    public  void employeeWage(){

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
            if (workingHour>totalWorkingHour){
                workingHour=totalWorkingHour;
            }
            totalWage=totalWage+dayWage;
            System.out.print(" total working hour is "+workingHour);
            System.out.print( " and current day wage is "+ dayWage);
            System.out.println();

            day++;


        }
        System.out.println("total wage is " +totalWage );
    }

    public int getFullDayHour() {
        return fullDayHour;
    }

    public void setFullDayHour(int fullDayHour) {
        this.fullDayHour = fullDayHour;
    }

    public int getPartDayHour() {
        return partDayHour;
    }

    public void setPartDayHour(int partDayHour) {
        this.partDayHour = partDayHour;
    }

    public int getWagePerHour() {
        return wagePerHour;
    }

    public void setWagePerHour(int wagePerHour) {
        this.wagePerHour = wagePerHour;
    }

    public int getTotalWorkingDays() {
        return totalWorkingDays;
    }

    public void setTotalWorkingDays(int totalWorkingDays) {
        this.totalWorkingDays = totalWorkingDays;
    }

    public int getTotalWorkingHour() {
        return totalWorkingHour;
    }

    public void setTotalWorkingHour(int totalWorkingHour) {
        this.totalWorkingHour = totalWorkingHour;
    }

    public static void main(String[] args) {
        EmpWage company1 = new EmpWage();
        System.out.println("For company one : ");
        company1.setFullDayHour(8);
        company1.setPartDayHour(4);
        company1.setWagePerHour(20);
        company1.setTotalWorkingDays(20);
        company1.setTotalWorkingHour(100);
        company1.employeeWage();
        System.out.println();
        System.out.println("For company two : ");
        EmpWage company2 = new EmpWage();
        company2.setFullDayHour(12);
        company2.setPartDayHour(6);
        company2.setWagePerHour(18);
        company2.setTotalWorkingDays(22);
        company2.setTotalWorkingHour(120);
        company2.employeeWage();


    }
}

