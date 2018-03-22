package by.learn.lessons.RobotsAndInheritance;

/**
 * изучение наследования
 */

public class RoboActivator {

    public static void main (String[] args) {
        RoboBall robot = new RoboBall();
    }

}


class Robot {
    private String modelName; //название модели
    private int weight;       // вес робота

    Robot (){
        System.out.println("Status");
    }

}

class CatRobot extends Robot{
    private double tailLenght;

    CatRobot() {
        System.out.println("Active status");
    }
}

class RoboBall extends CatRobot {
    private double diameter;

    RoboBall (){
        System.out.println("YO YO");
    }

}

