import com.cars.*;

import java.util.Scanner;
import static java.lang.System.*;

public class Main {
    void useCar(Car car) {
          car.driving();
        out.println(car.maxSpeed());
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        Main main = new Main();
        Car car = new Tayota();
        main.useCar(car);
    }
}