
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int  isPresent = 0;
        int isAbsent = 1;

        int Attendance = (int)((Math.random()*10)%2);

        if(Attendance == isPresent) {
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is absent");
        }
    }
}