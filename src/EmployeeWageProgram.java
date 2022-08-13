public class EmployeeWageProgram {
    public static void main(String[] args) {
        System.out.println("WELCOME TO EMPLOYEE WAGE PROGRAM");
        int empcheck = (int) (Math.random() * (2));
        if (empcheck == 1) {
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is absent");
        }
    }
}
