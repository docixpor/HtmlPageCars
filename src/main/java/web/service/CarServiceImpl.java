package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.models.Car;
import java.util.ArrayList;
import java.util.List;

@Service
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
        if (count >= 5) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}
