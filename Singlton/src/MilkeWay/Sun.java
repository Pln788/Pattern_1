package MilkeWay;

public class Sun implements Planet{
    private static Sun instance;

    private Sun() {
    }

    public static Sun getInstance() {
        if (instance == null) {
            instance = new Sun();
            System.out.println("Произошло создание звезды Солнце.");
        }
        return instance;
    }
}
