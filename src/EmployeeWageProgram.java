public class EmployeeWageProgram {
    public static void main(String[] args) {
        System.out.println("WELCOME TO EMPLOYEE WAGE PROGRAM");
        int wagePerHour = 20;
        int fullTimeHour = 8;
        int partTimeHour = 4;
        int dailyWage = 0;
        int WorkingDays = 20;
        for (int day = 0; day <= WorkingDays; day++) {


            int empcheck = (int) (Math.random() * ((2) + 1));
            switch (empcheck) {
                case 1:
                    System.out.println("Employee is full day present " +day);
                    dailyWage = dailyWage + wagePerHour * fullTimeHour;
                    break;
                case 2:
                    System.out.println("Employee is half day present " +day);
                    dailyWage = dailyWage + wagePerHour * partTimeHour;
                    break;
                default:
                    System.out.println("Employee is absent " +day);
            }
            //    if (empcheck == 1) {
            //        System.out.println("Employee is full day present");
            //        dailyWage = wagePerHour * fullTimeHour ;
            //        System.out.println(dailyWage);
            //    } else if (empcheck == 2) {
            //        System.out.println("Employee is half day present");
            //        dailyWage = wagePerHour * partTimeHour;
            //        System.out.println(dailyWage);
            //    } else {
            //        System.out.println("Employee is absent");
//       }
        }
        System.out.println("Employee's total wage for month is: " +dailyWage );
    }
}
