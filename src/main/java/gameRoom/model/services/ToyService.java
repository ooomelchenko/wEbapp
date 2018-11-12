package gameRoom.model.services;

import gameRoom.model.entity.*;
import gameRoom.model.enums.AgeGroup;
import gameRoom.model.enums.ChildMale;

import java.sql.SQLException;
import java.util.List;

public interface ToyService {
    List<Toy> getAllToys() throws SQLException, ClassNotFoundException;

    List<Toy> getAllToysSortedByPrice() throws SQLException, ClassNotFoundException;

    List<Ball> getAllBalls() throws SQLException, ClassNotFoundException;

    List<Car> getAllCars() throws SQLException, ClassNotFoundException;

    List<Cube> getAllCubes() throws SQLException, ClassNotFoundException;

    List<Doll> getAllDolls() throws SQLException, ClassNotFoundException;

    List<Toy> getToysSortedByPrice(List<Toy> toyList) throws SQLException, ClassNotFoundException;

    List<Toy> getAllToysSortedByName() throws SQLException, ClassNotFoundException;

    List<Toy> getAllToysSortedByAgeGroup() throws SQLException, ClassNotFoundException;

    List<Toy> getAllToysSortedByChildMale() throws SQLException, ClassNotFoundException;

    List<Toy> getFilteredToys(Long minPrice, Long maxPrice, ChildMale childMale, AgeGroup ageGroup);
}
