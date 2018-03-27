package by.learn.lessons.RobotsAndInheritance;

import javax.swing.*;

/**
 * изучение наследования
 */

public class RoboActivator {
    static int classVariable;
    static boolean isMage;
    static boolean isWarrior;
    static int classNum;
    static int charLevel;
    static int playerCoins;
    static boolean player1IsMage;
    static boolean player2IsMage;
    static int mana;
    public static void main (String[] args) {
        //RoboBall robot = new RoboBall();
        /*System.out.println(classVariable);
        System.out.println(levelUp(7));
        */
        player1IsMage = true;
        player2IsMage = false;

        isWarrior = true;
        classNum = 1;
        charLevel = 3;

        if(!isWarrior) showMageSkills();
        else showWarriorSkills();

        if(classNum ==1 && charLevel > 5) giveNewMageSkill();
        else if(classNum ==2 && charLevel > 5) giveNewWarriorSkill();

        if(classNum ==1 && (charLevel > 5 || playerCoins > 1000))giveNewMageSkill();
        else giveNewWarriorSkill();

        if(player1IsMage^player2IsMage) openDungeon();
        else showWarning();

        if(isMage) mana =500;
        else mana =100;

        mana = isMage ? 500 : 100; //тернарный оператор

        String  playerName = "Roilen";
        String guildName = "RGB";
        String fullName = playerName+" "+ guildName;
        System.out.println(fullName);

        String coinsFound = 5 +5 + " coins found";
        String coinsFound2 = "Player found " + (5 + 5) + " coins";
        System.out.println(coinsFound);
        System.out.println(coinsFound2);





    }
    public static void showMageSkills(){
        System.out.println("Some magic!");
    }
    public static void showWarriorSkills(){
        System.out.println("Some strength");
    }
    public static void giveNewMageSkill(){
        System.out.println("New Mage Skill gained");
    }
    public static void giveNewWarriorSkill(){
        System.out.println("New Warrior Skill gained");
    }
    public static void openDungeon(){
        System.out.println("Dungeon opened");
    }
    public static void showWarning(){
        System.out.println("Two same classes!");
    }



    public static int levelUp(int lvl){
        classVariable +=1;
        return  lvl+1;
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

