public class DemoIf {
    public static void main(String[] args) {
        double salary = 15000.0d; // by default numbers contain decimal places are recognized as double type
        // similar to double salary = 15000.0

        if (salary > 14000) {
            System.out.println("salary > 14000");
        }
        if (salary >= 15000) {
            System.out.println("salary >= 15000.");
        }
        if (salary < 17000) {
            System.out.println("salary < 17000");
        }
        if (salary <= 15000) {
            System.out.println("salary <= 15000");
        }

        char grade = 'A';
        if (grade == 'A') {
            System.out.println("grade = A.");
        } else if (grade == 'B') {
            System.out.println("grade = B.");
        } else if (grade == 'C') {
            System.out.println("grade = C.");
        } else if (grade == 'D') {
            System.out.println("grade = D.");
        } else if (grade == 'E') {
            System.out.println("grade = E.");
        } else {
            System.out.println("Failed");
        }

        int score = 75;
        int score2 = 40;

        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80 && score < 90) {
            grade = 'B';
        } else if (score >= 70 && score < 80) {
            grade = 'C';
        } else if (score >= 60 && score < 70) {
            grade = 'D';
        } else if (score >= 50 && score < 60) {
            grade = 'E';
        } else if (score >= 40 && score < 0) {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);
        if (score <= 100 && score >= 0) {
            if (score >= 90) {
                grade = 'A';
            } else if (score >= 80) {
                grade = 'B';
            } else if (score >= 70) {
                grade = 'C';
            } else if (score >= 60) {
                grade = 'D';
            } else if (score >= 50) {
                grade = 'E';
            } else if (score >= 40) {
                grade = 'F';
            }
        }

        grade = score >= 90 ? 'A' : score >= 80 ? 'B' : score >= 70 ? 'C' : score >= 60 ? 'D' : score >= 50 ? 'E' : 'F';
        System.out.println("Grade = " + grade);

        // Exercise 2 - grade is failed if either score and score2 failed, otherwise
        // compute the average grade for the score and score2
        score = 101;
        score2 = 1;
        if (score <= 100 && score >= 50) { // score is 50-100
            if (score2 <= 100 && score2 >= 50) { // score2 is 50-100
                double averageScore = (score + score2) / 2;
                if (averageScore >= 90) {
                    grade = 'A';
                } else if (averageScore >= 80) {
                    grade = 'B';
                } else if (averageScore >= 70) {
                    grade = 'C';
                } else if (averageScore >= 60) {
                    grade = 'D';
                } else {
                    grade = 'E';
                }
            } else if (score2 < 50 && score2 >= 0) { // score2 is 0 - 49
                grade = 'f'; // As score2 is failed
            } else {
                grade = 'n';
            } // score2 is out of range from 0 to 100
        } else if (score < 50 && score >= 0) {// score is 0-49 {
            grade = 'F'; // As score is failed.
        } else {
            grade = 'N';
        }
        System.out.println("totalGrade is " + grade);

    }
}
