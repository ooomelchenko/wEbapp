package gameRoom.model.dao;

import gameRoom.model.entity.Car;
import gameRoom.model.enums.AgeGroup;
import gameRoom.model.enums.CarType;
import gameRoom.model.enums.ChildMale;
import gameRoom.util.JDBCFactoryMySQL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao {

    @Override
    public List<Car> getAll() throws SQLException, ClassNotFoundException {
        List<Car> resultList = new ArrayList<>();

        try (Connection connection = JDBCFactoryMySQL.getConnection()) {

            ResultSet res = connection.createStatement().executeQuery("select * from cars");

            while (res.next()) {
                long id = res.getLong("id");
                String name = res.getString("name");
                int priceUSD = res.getInt("priceUSD");
                AgeGroup ageGroup = AgeGroup.valueOf(res.getString("ageGroup"));
                ChildMale childMale = ChildMale.valueOf(res.getString("childMale"));
                int countOfWheels = res.getInt("countOfWheels");
                CarType carType = CarType.valueOf(res.getString("carType"));

                resultList.add(new Car(id, name, priceUSD, ageGroup, childMale, countOfWheels, carType));
            }
        }
        return resultList;

    }
}
