
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double salaryPerHour = 20;

        int  isPresent = 0;
        int isAbsent = 1;
        int workHours;

        int Attendance = (int)((Math.random()*10)%2);

        if(Attendance == isPresent) {
            System.out.println("Employee is present");
            workHours = 8;
        } else {
            System.out.println("Employee is absent");
            workHours = 0;
        }
        double dailyWages = salaryPerHour*workHours;
        System.out.println("daily wage of worker" + dailyWages);

    }
}