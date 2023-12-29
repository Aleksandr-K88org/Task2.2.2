package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    @Autowired
    private CarDaoImpl carDaoImpl;
    @Override
    public List<Car> cars(int count) {
        return carDaoImpl.getCar(count);
    }
}
