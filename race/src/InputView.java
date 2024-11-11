import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {
    Scanner scanner = new Scanner(System.in);

    public List<String> inputCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String input = scanner.nextLine();
        List<String> carNames = Arrays.asList(input.split(","));
        // 배열을 List로 변경합니다. JAVA에서는 배열의 크기를 동적으로 변경할 수 없기때문에,
        // 리스트를 이용해 추가 제거 합니다.
        return carNames;
    }

    public int inputExecuteNumber() {
        System.out.println("시도할 회수는 몇회인가요?");
        int executeNumber = scanner.nextInt();

        return executeNumber;
    }
}
