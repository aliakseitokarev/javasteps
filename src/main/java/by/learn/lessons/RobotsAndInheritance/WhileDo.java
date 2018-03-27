package by.learn.lessons.RobotsAndInheritance;

/**
 * Created by user on 26.03.2018.
 */
public class WhileDo {
    static int characterHealth = 400;
    static int maxHealth = 1000;

    public static void main(String[] args) {
        boolean characterIsPoisened = true;
        while (characterIsPoisened){
            decreaseHeaith(5);
        }
        while (!characterIsPoisened){
            if (characterHealth == maxHealth) break;
            increaseHeaith(1);
        }
        do {
            increaseHeaith(1);
            if (characterHealth == maxHealth) break;
        } while (!characterIsPoisened);

    }
    static void decreaseHeaith(int amount){
        characterHealth -= amount;
    }
    static void increaseHeaith(int amount){
        characterHealth += amount;
    }
}
