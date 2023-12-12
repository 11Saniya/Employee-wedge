class Employee {
    private double salaryPerHour = 20;
    private int totalWorkingDaysInMonth = 20; // Assuming 20 working days in a month
    private int totalWorkingHoursInMonth = 100; // Assuming 100 working hours in a month

    public void computeEmployeeWage() {
        int totalHoursWorked = 0;
        int totalDaysWorked = 0;
        double monthlyWages = 0;

        while (totalHoursWorked < totalWorkingHoursInMonth && totalDaysWorked < totalWorkingDaysInMonth) {
            int Attendance = (int) ((Math.random() * 10) % 3);
            int workHours;

            switch (Attendance) {
                case 0:
                    System.out.println("Day " + (totalDaysWorked + 1) + ": Employee is present");
                    workHours = 8;
                    break;
                case 1:
                    System.out.println("Day " + (totalDaysWorked + 1) + ": Employee is absent");
                    workHours = 0;
                    break;
                case 2:
                    System.out.println("Day " + (totalDaysWorked + 1) + ": Employee is present for part-time");
                    workHours = 4; // Assuming part-time hours as 4
                    break;
                default:
                    System.out.println("Day " + (totalDaysWorked + 1) + ": Invalid attendance status");
                    workHours = 0;
                    break;
            }

            // Update total hours worked and days worked
            totalHoursWorked += workHours;
            totalDaysWorked++;

            double dailyWages = salaryPerHour * workHours;
            monthlyWages += dailyWages;
        }

        System.out.println("Total days worked: " + totalDaysWorked);
        System.out.println("Total hours worked: " + totalHoursWorked);
        System.out.println("Monthly wage of worker: " + monthlyWages);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.computeEmployeeWage();
    }
}
