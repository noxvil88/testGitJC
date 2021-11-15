import java.util.HashMap;
import java.util.Map;

public class Controller {

    private WeatherModel weatherModel = new AccuweatherModel();
    private Map<Integer, Period> variants = new HashMap<>();

    public Controller() {
        this.variants.put(1, Period.NOW);
        this.variants.put(5, Period.FIVE_DAYS);
    }

    public void getWeather(String userInput, String selectedCity) {
        Integer userIntInput = Integer.parseInt(userInput);

        switch (variants.get(userIntInput)) {
            case NOW:
                weatherModel.getWeather(selectedCity, Period.NOW);
                break;
            case FIVE_DAYS:
                weatherModel.getWeather(selectedCity, Period.FIVE_DAYS);
                break;

        }
    }
}
