package MilkeWay;

public class Moon implements Planet{
    private static Moon instance;

    private Moon() {
    }

    public static Moon getInstance() {
        if (instance == null) {
            instance = new Moon();
            System.out.println("Произошло создание спутника Луна.");
        }
        return instance;
    }
}
