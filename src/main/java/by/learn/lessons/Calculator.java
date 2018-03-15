package by.learn.lessons;
/**
 Класс реализует калькулятор.
 */
public class Calculator {

    private int result; //Результат вычисления

    /**
     Суммирует аргументы.
     @params params Аргументы суммирования.
     */
    public void add(int ... params) {
        for (Integer param : params){
            this.result += param;
        }
    }

    /**
     Получает результат.
     @return результат вычисления.
     */
    public int getResult() {
        return this.result;
    }

    /**
     Очистить результат вычисления.
     */

    public void cleanResult() {
        this.result = 0;
    }
}
