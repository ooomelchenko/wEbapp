package gameRoom.model.services;

import gameRoom.model.dao.*;
import gameRoom.model.entity.*;
import gameRoom.model.enums.AgeGroup;
import gameRoom.model.enums.ChildMale;
import gameRoom.util.FilterToysUtil;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ToyServiceImpl implements ToyService {

    private BallDao ballDao;
    private CarDao carDao;
    private CubeDao cubeDao;
    private DollDao dollDao;

    public ToyServiceImpl() {
        ballDao = new BallDaoImpl();
        carDao = new CarDaoImpl();
        cubeDao = new CubeDaoImpl();
        dollDao = new DollDaoImpl();
    }

    @Override
    public List<Toy> getAllToys() throws SQLException, ClassNotFoundException {
        List<Toy> toyList = new ArrayList<>();

        toyList.addAll(ballDao.getAll());
        toyList.addAll(carDao.getAll());
        toyList.addAll(cubeDao.getAll());
        toyList.addAll(dollDao.getAll());

        return toyList;
    }

    @Override
    public List<Ball> getAllBalls() throws SQLException, ClassNotFoundException {
        return ballDao.getAll();
    }

    @Override
    public List<Car> getAllCars() throws SQLException, ClassNotFoundException {
        return carDao.getAll();
    }

    @Override
    public List<Cube> getAllCubes() throws SQLException, ClassNotFoundException {
        return cubeDao.getAll();
    }

    @Override
    public List<Doll> getAllDolls() throws SQLException, ClassNotFoundException {
        return dollDao.getAll();
    }

    @Override
    public List<Toy> getAllToysSortedByPrice() throws SQLException, ClassNotFoundException {
        List<Toy> toyList = getAllToys();
        return toyList.stream().sorted(Comparator.comparing(Toy::getPriceUSD)).collect(Collectors.toList());
    }

    @Override
    public List<Toy> getToysSortedByPrice(List<Toy> toyList) throws SQLException, ClassNotFoundException {
        return toyList.stream().sorted(Comparator.comparing(Toy::getPriceUSD)).collect(Collectors.toList());
    }

    @Override
    public List<Toy> getAllToysSortedByName() throws SQLException, ClassNotFoundException {
        List<Toy> toyList = getAllToys();
        return toyList.stream().sorted(Comparator.comparing(Toy::getName)).collect(Collectors.toList());
    }

    @Override
    public List<Toy> getAllToysSortedByAgeGroup() throws SQLException, ClassNotFoundException {
        List<Toy> toyList = getAllToys();
        return toyList.stream().sorted(Comparator.comparing(Toy::getAgeGroup)).collect(Collectors.toList());
    }

    @Override
    public List<Toy> getAllToysSortedByChildMale() throws SQLException, ClassNotFoundException {
        List<Toy> toyList = getAllToys();
        return toyList.stream().sorted(Comparator.comparing(Toy::getChildMale)).collect(Collectors.toList());
    }

    @Override
    public List<Toy> getFilteredToys(Long minPrice, Long maxPrice, ChildMale childMale, AgeGroup ageGroup) {
        List<Toy> toyList = new ArrayList<>();
        try {
            toyList = getAllToys();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        if(minPrice!=null )
        toyList = FilterToysUtil.byMinPrice(toyList, minPrice);

        if(maxPrice!=null )
        toyList = FilterToysUtil.byMaxPrice(toyList, maxPrice);

        if(childMale!=null )
        toyList = FilterToysUtil.byChildMale(toyList, childMale);

        if(ageGroup!=null )
        toyList = FilterToysUtil.byAgeGroup(toyList, ageGroup);

        return toyList;

    }
}
