package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarService;
import java.util.List;

@Controller
@RequestMapping(value = "/cars")
public class CarController {
    private CarService carService;

    @Autowired
    public void setCarService(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public String printCars(@RequestParam(name = "count", defaultValue = "5") int count, ModelMap model) {
        List<Car> cars = carService.getCountOfCarsList(count);
        model.addAttribute("car", cars);
        return "cars";
    }
}
