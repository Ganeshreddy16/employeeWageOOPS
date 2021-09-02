package org.blz.assignments;

public class EmployeeWagesOOPS
{
    public static final int IS_FULL_TIME=2;
    public static final int IS_PART_TIME=1;
    public static final int EMP_WAGE_PER_HOUR=20;
    public static final int WORKING_DAYS=20;
    public static int Totalwage=0;
    public static int Total_Working_Hours_Till_Now=0;

   public static int calculatingWage()
   {

       int WorkHours = 0;
       int Day=1;
       while (Day <= WORKING_DAYS && Total_Working_Hours_Till_Now<= 100 ) {

           System.out.println(" Wage for Day " + Day);
           double empCheck = (Math.floor(Math.random() * 10) % 3);
           switch ((int) empCheck) {
               case IS_FULL_TIME: {
                   WorkHours = 8;
                   int PerdaySalary = EMP_WAGE_PER_HOUR * WorkHours;
                   Totalwage= Totalwage +PerdaySalary;

                   Total_Working_Hours_Till_Now += WorkHours;
                   System.out.println("Full time Emp is " + PerdaySalary);
                   System.out.println("");
               }
               break;
               case IS_PART_TIME: {
                   WorkHours = 4;
                   int PerdaySalary = EMP_WAGE_PER_HOUR * WorkHours;
                   Totalwage= Totalwage +PerdaySalary;
                   Total_Working_Hours_Till_Now += WorkHours;
                   System.out.println("Part time Emp is " + PerdaySalary);
                   System.out.println("");
               }
               break;
               default: {
                   WorkHours = 0;
                   int PerdaySalary = EMP_WAGE_PER_HOUR * WorkHours;
                   Totalwage= Totalwage +PerdaySalary;

                   Total_Working_Hours_Till_Now += WorkHours;
                   System.out.println("Absentee is " + PerdaySalary );
                   System.out.println("");
               }

           }
           Day++;
       }
       System.out.println( "Total worked hours are " + Total_Working_Hours_Till_Now);
       System.out.println("Total wage is "+Totalwage);
       return Totalwage;


   }

    public static void main(String[] args)
    {
int salary;
       salary=calculatingWage();
     salary= (int)(salary+salary*0.4);
       System.out.println("Your salary with bonus is " + salary);




    }

}