public class App {

    public static void main(String[] args) throws Exception {
        InputView inputView = new InputView();
        RaceController raceController = new RaceController(inputView);
        raceController.start();
    }
}
