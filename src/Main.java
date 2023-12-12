public class Main {
    public static void main(String[] args) {

        double salaryPerHour = 20;
        int workHours;

        int Attendance = (int)((Math.random() * 10) % 3);

        switch (Attendance) {
            case 0:
                System.out.println("Employee is present");
                workHours = 8;
                break;
            case 1:
                System.out.println("Employee is absent");
                workHours = 0;
                break;
            case 2:
                System.out.println("Employee is present for part-time");
                workHours = 4; // Assuming part-time hours as 4
                break;
            default:
                System.out.println("Invalid attendance status");
                workHours = 0;
                break;
        }

        double dailyWages = salaryPerHour * workHours;
        System.out.println("Daily wage of worker: " + dailyWages);
    }
}
