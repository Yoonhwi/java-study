import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RaceController {
    private InputView inputView;

    public RaceController(InputView inputView) {
        this.inputView = inputView;
    }

    public List<Car> inputCars() {
        List<String> carNames = inputView.inputCarNames();

        List<Car> cars = new ArrayList<>();
        for (String carName : carNames) {
            Car car = new Car(carName);
            cars.add(car);
        }

        return cars;
    }

    public void playGrounds(List<Car> cars) {
        int executeNumber = inputView.inputExecuteNumber();

        System.out.println("\n실행결과");
        for (int i = 0; i < executeNumber; i++) {
            for (Car car : cars) {
                int random = new Random().nextInt(10);
                if (random >= 4) {
                    car.move();
                }
                System.out.printf("%s : %s\n", car.getName(), "-".repeat(car.getPosition()));
            }
            System.out.println();
        }
    }

    public void printResult(List<Car> cars) {
        int longestPosition = 0;
        List<String> winners = new ArrayList<>();

        for (Car car : cars) {
            longestPosition = Math.max(longestPosition, car.getPosition());
        }

        for (Car car : cars) {
            if (car.getPosition() == longestPosition) {
                winners.add(car.getName());
            }
        }
        String result = String.join(", ", winners);
        System.out.printf("최종 우승자 : %s", result);

    }

    public void start() {
        List<Car> cars = inputCars(); // Car를 생성
        playGrounds(cars);
        printResult(cars);
    }
}
