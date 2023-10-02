import java.util.Scanner;

public class ProgramLab {
    public static void main(String[] args) {
        /* Type your code here. */
        /* Declaring Variables */
        Scanner scnr = new Scanner(System.in);
        String stuStatus = scnr.next();
        String ug = "UG";
        String g = "G";
        String dl = "DL";
        double homework = scnr.nextDouble();
        double quizzes = scnr.nextDouble();
        double midterm = scnr.nextDouble();
        double finalExam = scnr.nextDouble();


        if (stuStatus.equals(ug) || stuStatus.equals(g) || stuStatus.equals(dl)){
            homework = (homework / 800) * 100;
            if (homework > 100.0){
                homework = 100.0;
            }
            else {
                homework = homework;
            }
            quizzes = (quizzes / 400) * 100;
            if (quizzes > 100.0){
                quizzes = 100.0;
            }
            else {
                quizzes = quizzes;
            }
            midterm = (midterm / 150) * 100;
            if (midterm > 100.0){
                midterm = 100.0;
            }
            else {
                midterm = midterm;
            }
            finalExam = (finalExam / 200) * 100;
            if (finalExam > 100.0){
                finalExam = 100.0;
            }
            else {
                finalExam = finalExam;
            }

            System.out.printf("Homework: %.1f%%%n", homework);
            System.out.printf("Quizzes: %.1f%%%n", quizzes);
            System.out.printf("Midterm: %.1f%%%n", midterm);
            System.out.printf("Final Exam: %.1f%%%n", finalExam);

            if (stuStatus.equals(ug)){
                double ugHomework = homework * 0.2;
                double ugQuizzes = quizzes * 0.2;
                double ugMidterm = midterm * 0.3;
                double ugFinal = finalExam * 0.3;

                double ugTotal = ugHomework + ugQuizzes + ugMidterm + ugFinal;
                System.out.printf("UG average: %.1f%%%n", ugTotal);

                if (ugTotal >= 90.0){
                    System.out.println("Course grade: A");
                }
                else if (ugTotal >= 80.0){
                    System.out.println("Course grade: B");
                }
                else if (ugTotal >= 70.0){
                    System.out.println("Course grade: C");
                }
                else if (ugTotal >= 60.0){
                    System.out.println("Course grade: D");
                }
                else {
                    System.out.println("Course grade: F");
                }
            }
            else if (stuStatus.equals(g)){
                double gHomework = homework * 0.15;
                double gQuizzes = quizzes * 0.05;
                double gMidterm = midterm * 0.35;
                double gFinal = finalExam * 0.45;

                double gTotal = gHomework + gQuizzes + gMidterm + gFinal;
                System.out.printf("G average: %.1f%%%n", gTotal);

                if (gTotal >= 90.0){
                    System.out.println("Course grade: A");
                }
                else if (gTotal >= 80.0){
                    System.out.println("Course grade: B");
                }
                else if (gTotal >= 70.0){
                    System.out.println("Course grade: C");
                }
                else if (gTotal >= 60.0){
                    System.out.println("Course grade: D");
                }
                else {
                    System.out.println("Course grade: F");
                }
            }
            else if (stuStatus.equals(dl)){
                double dlHomework = homework * 0.05;
                double dlQuizzes = quizzes * 0.05;
                double dlMidterm = midterm * 0.4;
                double dlFinal = finalExam * 0.5;

                double dlTotal = dlHomework + dlQuizzes + dlMidterm + dlFinal;
                System.out.printf("DL average: %.1f%%%n", dlTotal);

                if (dlTotal >= 90.0){
                    System.out.println("Course grade: A");
                }
                else if (dlTotal >= 80.0){
                    System.out.println("Course grade: B");
                }
                else if (dlTotal >= 70.0){
                    System.out.println("Course grade: C");
                }
                else if (dlTotal >= 60.0){
                    System.out.println("Course grade: D");
                }
                else {
                    System.out.println("Course grade: F");
                }
            }


        }
        else {
            System.out.println("Error: student status must be UG, G or DL");
        }
    }
}