import javax.imageio.IIOException;
import java.io.IOException;
import java.time.Period;

public interface WeatherModel {

    void getWeather(String selectedCity, Period period) throws IOException;
}
