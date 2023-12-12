public class Main {
    public static void main(String[] args) {

        double salaryPerHour = 20;
        int totalWorkingDaysInMonth = 20;
        double monthlyWages = 0;

        for (int day = 1; day <= totalWorkingDaysInMonth; day++) {
            int Attendance = (int)((Math.random() * 10) % 3);
            int workHours;

            switch (Attendance) {
                case 0:
                    System.out.println("Day " + day + ": Employee is present");
                    workHours = 8;
                    break;
                case 1:
                    System.out.println("Day " + day + ": Employee is absent");
                    workHours = 0;
                    break;
                case 2:
                    System.out.println("Day " + day + ": Employee is present for part-time");
                    workHours = 4; // Assuming part-time hours as 4
                    break;
                default:
                    System.out.println("Day " + day + ": Invalid attendance status");
                    workHours = 0;
                    break;
            }

            double dailyWages = salaryPerHour * workHours;
            monthlyWages += dailyWages;
        }

        System.out.println("Monthly wage of worker for " + totalWorkingDaysInMonth + " days: " + monthlyWages);
    }
}
