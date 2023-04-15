package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.DAO.DaoCar;

import java.util.Optional;

@Controller
public class CarController {

    private DaoCar daoCar;
    @Autowired
    public CarController(DaoCar daoCar) {
        this.daoCar = daoCar;
    }
    @GetMapping("/carsAll")
    public String showAll(ModelMap model) {
        model.addAttribute("listOfCars", daoCar.getList());
        return "carsAll";
    }

    @GetMapping("/cars")
    public String showCarsFromList(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
        model.addAttribute("listOfCars", daoCar.getListOfCars(count));
        return "cars";
    }
}
