package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarService;
import web.service.CarServiceImpl;
import java.util.List;

@Controller
@RequestMapping(value = "/cars")
public class CarController {
    CarService carService = new CarServiceImpl();

    @GetMapping()
    public String printCars(@RequestParam(name = "count", defaultValue = "0") int count, ModelMap model) {
        List<Car> cars;
        if (count > 0 && count < 6) {
            cars = carService.getCountOfCarsList(count);
            model.addAttribute("car", cars);
        } else {
            cars = carService.createCarsList();
            model.addAttribute("car", cars);
        }
        return "cars";
    }
}
