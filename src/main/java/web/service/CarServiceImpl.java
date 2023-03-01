package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Toyota", 2, 180));
        cars.add(new Car("Nissan", 1, 145));
        cars.add(new Car("BMW", 5, 220));
        cars.add(new Car("Volkswagen", 2, 235));
        cars.add(new Car("Honda", 2, 105));
    }

    @Override
    public List<Car> getCountOfCarsList(int count) {
        if (count >= cars.size() || count == 0) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
