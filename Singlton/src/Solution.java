import MilkeWay.Planet;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название космического объекта: Земля, Луна или Солнце");
        String key = in.nextLine();
        Planet.readKeyFromConsoleAndInitPlanet(key);
    }
}
