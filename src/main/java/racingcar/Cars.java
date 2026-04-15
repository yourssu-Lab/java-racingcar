package racingcar;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Cars {
    private static final Random random = new Random();
    private final List<Car> cars;

    Cars(List<String>names){
        this.cars=names.stream().map(Car::new).toList();
    }

    public void moveAll(){
        cars.forEach(car->car.tryMove());

    }

    public String findWinners(){
        int max = getMaxPosition();
        String winners = cars.stream()
                .filter(car -> car.getPosition()==max)
                .map(Car::getName)
                .collect(Collectors.joining(","));
        return winners;
    }
    private int getMaxPosition(){
        return cars.stream().mapToInt(Car::getPosition).max().orElse(0);
    }

    public List<Car>getCars(){return cars;}
}
