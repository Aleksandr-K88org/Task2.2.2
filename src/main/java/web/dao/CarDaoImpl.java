package web.dao;

import jdk.jfr.Registered;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao{

    private static final List<Car> cars = new ArrayList<>();
    static {
        cars.add(new Car("BMW", "black", 1999));
        cars.add(new Car("BMW", "black", 2012));
        cars.add(new Car("Audi", "black", 2013));
        cars.add(new Car("LADA", "black", 1998));
        cars.add(new Car("Москвич", "black", 1989));
    }

    @Override
    public List<Car> getCar(int count) {
        if (count == 0) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
