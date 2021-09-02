package org.blz.assignments;

import java.util.Scanner;

public class EmployeeWagesOOPS
{
    public static void calculatingWage(int FULLTIME_EMP_WAGE_PER_HOUR, int FULLTIME_WORKING_HOURS, int PARTTIME_EMP_WAGE_PER_HOUR, int PARTTIME_WORKING_HOURS, int WORKING_DAYS, int WORKING_HOURS)
    {

        int Day = 1;
        int Totalwage = 0;
        int Total_Working_Hours_Till_Now = 0;
        final int IS_PART_TIME = 1;
        final int IS_FULL_TIME = 2;
        while (Day <= WORKING_DAYS && Total_Working_Hours_Till_Now <= WORKING_HOURS)
        {
            double empCheck = (Math.floor(Math.random() * 10) % 3);

            switch ((int) empCheck)
            {
                case IS_FULL_TIME:
                {
                    int PerdaySalary = FULLTIME_EMP_WAGE_PER_HOUR * FULLTIME_WORKING_HOURS;
                    Totalwage = Totalwage + PerdaySalary;

                    Total_Working_Hours_Till_Now += FULLTIME_WORKING_HOURS;
                    System.out.println("Full time Emp Day " + Day + " Salary is " + PerdaySalary);
                    System.out.println("");
                }
                break;

                case IS_PART_TIME:
                {
                    int PerdaySalary = PARTTIME_EMP_WAGE_PER_HOUR * PARTTIME_WORKING_HOURS;
                    Totalwage = Totalwage + PerdaySalary;
                    Total_Working_Hours_Till_Now += PARTTIME_WORKING_HOURS;
                    System.out.println("Part time Emp Day " + Day + " Salary is " + PerdaySalary);
                    System.out.println("");
                }
                break;

                default:
                {
                    System.out.println("Emp is Absentee on Day " + Day);
                    System.out.println("");
                }

            }
            Day++;
        }
        System.out.println("Total worked hours are " + Total_Working_Hours_Till_Now);
        System.out.println("Total wage is " + Totalwage);

    }

    public static void main(String[] args)
    {
        int Company_FULLTIME_EMP_WAGE_PER_HOUR;
        int Company_PARTTIME_EMP_WAGE_PER_HOUR;
        int Company_FULLTIME_WORKING_HOURS;
        int Company_PARTTIME_WORKING_HOURS;
        int Company_WORKING_DAYS;
        int Company_Working_Hours;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Company Working Details: \n1.FullTime Wage per hour : \n2.FullTime Working Hours per day:  \n3.PartTime Wage per hour: \n4.PartTime Working hours per day:  \n5.Company Working Days : \n6.Company Working Hours ");
        Company_FULLTIME_EMP_WAGE_PER_HOUR = input.nextInt();
        Company_FULLTIME_WORKING_HOURS = input.nextInt();
        Company_PARTTIME_EMP_WAGE_PER_HOUR = input.nextInt();
        Company_PARTTIME_WORKING_HOURS = input.nextInt();
        Company_WORKING_DAYS = input.nextInt();
        Company_Working_Hours = input.nextInt();

        calculatingWage(Company_FULLTIME_EMP_WAGE_PER_HOUR, Company_FULLTIME_WORKING_HOURS, Company_PARTTIME_EMP_WAGE_PER_HOUR, Company_PARTTIME_WORKING_HOURS, Company_WORKING_DAYS, Company_Working_Hours);

    }

}