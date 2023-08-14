package MilkeWay;

public class Earth implements Planet{
    private static Earth instance;

    private Earth() {
    }

    public static Earth getInstance() {
        if (instance == null) {
            instance = new Earth();
            System.out.println("Произошло создание планеты Земля.");
        }
        return instance;
    }
}
