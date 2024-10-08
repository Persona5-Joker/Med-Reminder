import java.util.*;
import java.time.LocalTime;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many medications do you take?: "); int num = scanner.nextInt();
        int doses;
        String[] medication = new String[num];
        int time;
        String amOrPm;


        for (int i = 0; i < 1; i++) {
            System.out.print("List the medication: ");
            for (int j = 0; j < num; j++) {
                medication[i] = scanner.next();
            }
            System.out.println("How many times doses do you have to take a day: "); doses = scanner.nextInt();
            int leftOverDoses = (doses - 1);
            System.out.println("What time did you take your medicine? "); time = scanner.nextInt();
            System.out.print("AM or PM? "); amOrPm = scanner.next();

            System.out.println("How many hours until you have to take the next dose: "); int hoursToSeconds = scanner.nextInt() *3600;
            timer clock = new timer(hoursToSeconds);
            Thread thread = new Thread(clock);

            System.out.println("You have " + leftOverDoses + " doses left of medication.");

            System.out.println("Don't forget to take your medication!");
            System.out.println("Time till next Dose of Medication: "); thread.start();

        }

    }
}
