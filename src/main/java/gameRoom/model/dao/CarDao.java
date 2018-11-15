package gameRoom.model.dao;

import gameRoom.model.entity.Car;

import java.sql.SQLException;
import java.util.List;

public interface CarDao  { //extends AutoCloseable
    List<Car> getAll() throws SQLException, ClassNotFoundException;
}
