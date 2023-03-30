package web.dao;

import web.model.Car;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

public class CarDaoWeb implements CarDao{
    private static List<Car> getListCars() {
        List<Car> messages = new ArrayList<>();
        messages.add(new Car("asdawad",1,80));
        messages.add(new Car("fddd",5,70));
        messages.add(new Car("ddds",12,68));
        messages.add(new Car("dd12e31ds",1,61));
        messages.add(new Car("ddfdfgdds",14,76));
        return messages;
    }
    private static List<Car> getCarLimitedStstic(String chekCount){
        List<Car> messages=new ArrayList<>();
        if (chekCount==null){
            messages = CarDaoWeb.getListCars();
        } else {
            for (int i=0;i<Integer.parseInt(chekCount)&&i<5;i++){
                messages.add(CarDaoWeb.getListCars().get(i));
            }
        }
        return messages;
    }
    @Override
    public List<Car> getCarLimited(String chekCount) {
        return CarDaoWeb.getCarLimitedStstic(chekCount);
    }
    @Override
    public String getChekCount(HttpServletRequest request){
        String chekCount=request.getParameter("count");
        return chekCount;
    }
}
