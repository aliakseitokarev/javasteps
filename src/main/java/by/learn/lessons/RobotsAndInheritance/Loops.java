package by.learn.lessons.RobotsAndInheritance;


import java.util.Arrays;

public class Loops {

    private static int[] treasureChest = {12,200,14,76,197,3,201};
    private static int[][] playingField = new int[5][5];
    private static int experience = 320;

    public static void main(String[] args) {


        System.out.println(divide(7,13));

        feedZombies();

        shareTreasure();

        int minTreasure = treasureChest[0], maxTreasure = treasureChest[0];
        for (int treasure : treasureChest) {
            if (treasure > maxTreasure) maxTreasure = treasure;
            if (treasure < minTreasure) minTreasure = treasure;
        }
        System.out.println("Золотишко себе " + maxTreasure + " / Золотишко другу " + minTreasure);

        fillMap();

        int counter = 1;
        for (int i = 0; i < playingField.length; i++){
            for (int j = 0; j < playingField[i].length; j++){
                playingField[i][j] = counter;
                counter++;
            }
        }
        System.out.println(Arrays.deepToString(playingField));

        expFountain();

        do {
            ++experience;
        }while (experience < 300);
        System.out.print(experience + " ");



    }

    public static void feedZombies(){
        int[] dates =  {1976, 1989, 1965, 1990, 1988, 1995, 1993};
        for(int i = 0; i < dates.length; i++){
            if(dates[i] % 2 != 0) dates[i] = 0;
        }
        System.out.println(Arrays.toString(dates));
    }

    public static void shareTreasure(){
        int[] chestTreasure = {12, 200, 14, 76, 197, 3, 201};
        int min = chestTreasure[0], max = chestTreasure[0];
        for(int i : chestTreasure){
            if(min > i) min = i;
            if(max < i) max = i;
        }
        System.out.println("Max: " + max + " Min: " + min);
    }

    public static void fillMap(){
        int[][] map = new int[5][5];
        int counter = 1;
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[i].length; j++){
                map[i][j] = counter;
                counter++;
            }
        }
        System.out.println(Arrays.deepToString(map));
    }

    public static void expFountain(){
        int characterExp = 450;
        do{
            characterExp++;
        }while(characterExp < 300);
        System.out.println(characterExp);
    }

    public static int divide(int a, int b){
        if (b == 0) return a;
        int c = a%b;
        return divide(b,c);
    }
}
