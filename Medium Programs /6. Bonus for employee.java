import java.util.Scanner;

public class BonusCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the grade of the employee (A or B): ");
        char grade = scanner.next().charAt(0);

        System.out.print("Enter the employee salary: ");
        double salary = scanner.nextDouble();

        double bonusPercentage = 0;
        if (grade == 'A') {
            bonusPercentage = 5;
        } else if (grade == 'B') {
            bonusPercentage = 10;
        } else {
            System.out.println("Invalid grade");
            scanner.close();
            return;
        }

        double bonus = (salary * bonusPercentage) / 100;
        if (salary < 10000) {
            bonus += (salary * 2) / 100;
        }

        double totalToBePaid = salary + bonus;

        System.out.println("Salary = " + salary);
        System.out.println("Bonus = " + bonus);
        System.out.println("Total to be paid = " + totalToBePaid);

        scanner.close();
    }
}
	
