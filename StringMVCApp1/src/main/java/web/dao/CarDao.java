package web.dao;

import web.model.Car;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface CarDao {
    List<Car> getCarLimited(String chekCount);
    String getChekCount(HttpServletRequest request);
}
