package MilkeWay;

public interface Planet {
    static public Planet readKeyFromConsoleAndInitPlanet(String key) {
        switch (key) {
            case "Земля" -> {
                return Earth.getInstance();
            }
            case "Луна" -> {
                return Moon.getInstance();
            }
            default -> {
                return Sun.getInstance();
            }
        }
    }
}
