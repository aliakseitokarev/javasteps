package by.learn.lessons.Calculator;

import java.util.Scanner;

/**
 класс для запуска калькулятора. Поддерживает ввод пользователя
 */
public class InteractRunner {

    public static void main(String[] arg) {
        Scanner reader = new Scanner(System.in);
        try {
            Calculator calc = new Calculator();
            String exit = "no";
            double first = 0.0;
            while (!exit.equals("yes")) {
                // check saved result
                if (first == 0) {
                    System.out.println("Enter the first arg : ");
                    first = Double.valueOf(reader.next()); //первый аргумент из консоли
                }
                System.out.println ("Enter second arg : ");
                double  second = Double.valueOf(reader.next()); //второй аргумент из консоли

                //System.out.println ("Enter required operation (add, subt, mult, div) : ");
                //String choice =  reader.next();
                //



                /**
                 * сделать проверку   вводимого значения требуемой операции - пока
                 * не знаю как (либо считать последнее сообщение из консоли либо
                 * либо как-то еще
                 */

                calc.switcher(calc.getOperation(), first, second);

                //попытка считать последнее сообщение которое было выведено в консоль...
                //boolean console = System.in.equals("Wrong operation");
                //System.out.println(console);

                System.out.println ("Result : " + calc.getResult());

                System.out.println ("Exit : yes/no ");
                exit = reader.next().toLowerCase();
                if (exit.equals("no")){
                    System.out.println ("Do you want to save the result?: yes/no");
                    //сохранение в памяти результата
                    if (reader.next().toLowerCase().equals("yes"))
                        first = calc.getResult();
                    else first =0;
                }
                //очищение результата
                calc.cleanResult();
            }
        } finally {
            reader.close();
        }
    }

 /*   public static String getOperation () {
        Scanner reader = new Scanner(System.in);
        System.out.println ("Enter required operation (add, subt, mult, div) : ");
        String choice = reader.next();
        return choice;
    }*/
}
