import java.util.Scanner;

public class StudentGrades extends Person {

    private int[] testScores;

    public StudentGrades(String firstName, String lastName, int id, int[] testScores) {
        super(firstName, lastName, id);
        this.testScores = testScores;
    }

    public char calculate() {
        double sum = 0;
        for (int i = 0; i < testScores.length; i++) {
            sum += testScores[i];
        }
        double avg = sum / testScores.length;

        if (avg >= 90) {
            return 'O';
        } else if (avg >= 80 && avg < 90) {
            return 'E';
        } else if (avg >= 70 && avg < 80) {
            return 'A';
        } else if (avg >= 55 && avg < 70) {
            return 'P';
        } else if (avg >= 40 && avg < 55) {
            return 'D';
        } else {
            return 'T';
        }
    }

    public void printPerson() {
        super.printPerson();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        StudentGrades s = new StudentGrades(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}
