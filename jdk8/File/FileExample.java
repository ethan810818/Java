package File;
import java.util.Date;

import File.NumberAndString.Number.Exercises;
import File.NumberAndString.Number.Question;

import java.util.Calendar;

public class FileExample {
  public static void main(String[] args) {
    // Date currentDate = new Date();
    // System.out.printf("Month: %tB\n", currentDate);

    // //td te
    // System.out.printf("Day with leading zeroes: %td\n", currentDate);
    // System.out.printf("Day with leading zeroes: %te\n", currentDate);

    // //ty tY
    // System.out.printf("2-digit year: %ty%n", currentDate);
    // System.out.printf("4-digit year: %tY%n", currentDate);

    // //tl
    // System.out.printf("Hour in 12-hour clock: %tl%n", currentDate);
    // System.out.printf("Minutes with leading zeroes: %tM%n", currentDate);
    // System.out.printf("Locale-specific am/pm: %tp%n", currentDate);
    // System.out.printf("Month with leading zeroes: %tm%n", currentDate);

    // //tD
    // System.out.printf("Date: %tD%n", currentDate);

    int number = 65;
    String string = "810";
    double floatValue = Double.NaN;
    Exercises exercises = new Exercises();


    String questionA = Question.convertIntToHexadecimal(number);
    System.out.println("Question 1.a is: " + questionA);

    int questionB = Question.convertStringToInt(string);
    System.out.println("Question 1.b is: " + questionB);

    boolean questionC = Question.checkNaN(floatValue);
    System.out.println("Question 1.c is: " + questionC);

    boolean questionD = Question.checkIntegerAndLong(number);
    System.out.println("Question 2 is: " + questionD);

    exercises.convertMaxToMin();

    exercises.valueOfDemo(args);

    exercises.valueOfDemoDinamic(args);

  }
}