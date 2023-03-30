package web.service;


import web.dao.CarDaoWeb;
import web.model.Car;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class CarServiceWeb implements CarService{
    CarDaoWeb carDaoWeb=new CarDaoWeb();

    public List<Car> getCarLimited(HttpServletRequest request){
        return carDaoWeb.getCarLimited(carDaoWeb.getChekCount(request));
    }

}
