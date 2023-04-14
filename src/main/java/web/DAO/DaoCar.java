package web.DAO;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import web.model.Cars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class DaoCar {
    private List<Cars> listOfCars = new ArrayList<>();

    {

        listOfCars.add(new Cars("BMW", "Germany", 2020l));
        listOfCars.add(new Cars("Mercedes", "Germany", 2000l));
        listOfCars.add(new Cars("Skoda", "Czech", 2019l));
        listOfCars.add(new Cars("Honda", "Japan", 2023l));
        listOfCars.add(new Cars("Audi", "Germany", 1999l));

    }
    public List<Cars> getList() {
        return listOfCars;
    }
    public  List<Cars> getListOfCars (int count) {
        if (count == 0 || count > 5) {return listOfCars;}
        return listOfCars.stream().limit(count).collect(Collectors.toList());
    }
}
