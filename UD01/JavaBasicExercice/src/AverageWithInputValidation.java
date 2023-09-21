import java.util.Scanner;

public class AverageWithInputValidation {
    public static void main(String[] args) {
        final int NUM_STUDENTS = 3;
        int numberIn;
        boolean isValid;
        int sum = 0;
        double media;

        Scanner in = new Scanner(System.in);

        for (int i = 1; i <= NUM_STUDENTS; i++) {

            do {
                System.out.print("Enter the mark (0-100) for student " + i + ": ");
                numberIn = in.nextInt();

                if (numberIn < 0 || numberIn > 100) {
                isValid = false;
                System.out.println("Invalid input, try again...");
                } else {
                    isValid = true;
                }
            } while (!isValid);

            sum += numberIn;
        }

        media = sum / NUM_STUDENTS;

        System.out.printf("The average is: %.2f%n", media);
        in.close();
    }
}
