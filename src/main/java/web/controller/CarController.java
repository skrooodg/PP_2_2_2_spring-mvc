package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    @GetMapping("/cars")
    public String showCarsFromList(@RequestParam("count") int count, Model model) {
        model.addAttribute("cars", daoCar.getListOfCars(count));
        return "cars";
    }
}
