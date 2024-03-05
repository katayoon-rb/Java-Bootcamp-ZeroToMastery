package controlflow.exercises;

public class Exercise2StudentGrade {
    public static void main(String[] args) {
        char grade = 'B';
        String comment = switch (grade) {
            case 'A' -> "Excellent!";
            case 'B' -> "Good job!";
            case 'C' -> "Average.";
            case 'D' -> "Needs improvement.";
            case 'F' -> "Failed.";
            default -> "Invalid grade.";
        };

        System.out.println("Comment: " + comment);
    }

}
