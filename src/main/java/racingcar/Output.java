package racingcar;

public class Output {
    public static void printRoundResult(){

    }


}

class Game {
    public void run() {
        Cars cars = new Cars(InputView.readCarNames());
        int round = InputView.readAttemptCount();
        for(int i=0;i<round;i++){
            cars.moveAll();
            render(cars);
        }
        System.out.println("최종 우승자 : "+cars.findWinners());
    }

    private void render(Cars cars) {
        cars.getCars().forEach(car -> System.out.println(car.getState()));
    }
}
