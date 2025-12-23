import java.util.Scanner;

class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int marks;

        // Taking marks for 5 subjects
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks of subject " + i + ": ");
            marks = sc.nextInt();
            total += marks;
        }

        double average = total / 5.0;

        System.out.println("Total Marks = " + total);
        System.out.println("Average = " + average);

        // Grade calculation
        if (average >= 90)
            System.out.println("Grade: A");
        else if (average >= 75)
            System.out.println("Grade: B");
        else if (average >= 60)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: Fail");
    }
}
