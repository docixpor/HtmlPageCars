package web.service;

import web.models.Car;
import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> createCarsList() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", 2,180));
        cars.add(new Car("Nissan", 1,145));
        cars.add(new Car("BMW", 5,220));
        cars.add(new Car("Volkswagen", 2,235));
        cars.add(new Car("Honda", 2,105));
        return cars;
    }

    @Override
    public List<Car> getCountOfCarsList(int count) {
        List<Car> updatedCarsList = new ArrayList<>();
        List<Car> oldCarsList = createCarsList();
        for (int i = 1; i <= count; i++) {
            updatedCarsList.add(oldCarsList.get(i - 1));
        }
        return updatedCarsList;
    }
}
