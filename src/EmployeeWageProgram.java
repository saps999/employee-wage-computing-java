public class EmployeeWageProgram {
    public static void main(String[] args) {
        System.out.println("WELCOME TO EMPLOYEE WAGE PROGRAM");
        int wagePerHour = 20;
        int fullTimeHour =8;
        int dailyWage=0;
        int empcheck = (int) (Math.random() * (2));
        if (empcheck == 1) {
            System.out.println("Employee is present");
            dailyWage = wagePerHour * fullTimeHour ;
            System.out.println(dailyWage);
        } else {
            System.out.println("Employee is absent");
        }
    }
}
