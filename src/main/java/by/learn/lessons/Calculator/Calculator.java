package by.learn.lessons.Calculator;

import java.util.Scanner;

/**
 * Класс реализует калькулятор.
 */
public class Calculator {

    private double result; //result of calculation

    /**
     * Summing args
     * @param first - arg #1
     * @param second - arg #2
     */
    public void add(double first, double second) {
        this.result = first+second;
        }

    /**
     * Subtractions args
     * @param first - arg #1
     * @param second - arg #2
     */
    public void subt(double first, double second) {
        this.result = first-second;
    }

    /**
     * Multiplication args
     * @param first - arg #1
     * @param second - arg #2
     */
    public void mult (double first, double second) {
        this.result = first*second;
    }

     /**
      * Division args
      * @param first - arg #1
      * @param second - arg #2
      */
     public void div (double first, double second) {
        this.result = first/second;
    }

    /**
     * Get result
     * @return result of calculation
     */
    public double getResult() {
        return this.result;
    }

    /**
     * Clean result
     */
    public void cleanResult() {
        this.result = 0;
    }


    public static String getOperation () {
        Scanner reader = new Scanner(System.in);
        System.out.println(" Enter required operation (add, subt, mult, div) : ");
        String choice = reader.next();
        return choice;
    }

    /**
     * Switch between operations and return result
     * @param operation add/subt/mult/div
     * @param first - arg #1
     * @param second - arg #2
     * @return result of calculation
     */
    public double switcher (String operation, double first, double second){

            switch (operation.toLowerCase()){
                case "add":
                    this.add(first, second);
                    break;
                case "subt":
                    this.subt(first, second);
                    break;
                case "mult":
                    this.mult(first, second);
                    break;
                case "div":
                    this.div(first, second);
                    break;
                default:
                    System.out.println("Wrong operation");
                    result = switcher(getOperation(), first, second);
        }
        return this.getResult();
    }

}
