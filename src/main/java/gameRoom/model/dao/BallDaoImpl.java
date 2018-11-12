package gameRoom.model.dao;

import gameRoom.model.entity.Ball;
import gameRoom.model.enums.AgeGroup;
import gameRoom.model.enums.BallType;
import gameRoom.model.enums.ChildMale;
import gameRoom.util.JDBCFactoryMySQL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class BallDaoImpl implements BallDao{

    @Override
    public List<Ball> getAll() throws SQLException, ClassNotFoundException {
        List<Ball> resultList = new ArrayList<>();

        try (Connection connection = JDBCFactoryMySQL.getConnection()) {

            ResultSet res = connection.createStatement().executeQuery("select * from balls");

            while (res.next()) {
                long id = res.getLong("id");
                String name = res.getString("name");
                int priceUSD = res.getInt("priceUSD");
                AgeGroup ageGroup = AgeGroup.valueOf(res.getString("ageGroup"));
                ChildMale childMale = ChildMale.valueOf(res.getString("childMale"));
                int diametrMM = res.getInt("diametrMM");
                BallType ballType = BallType.valueOf(res.getString("ballType"));

                resultList.add(new Ball(id, name, priceUSD, ageGroup, childMale, diametrMM, ballType));
            }
        }
        return resultList;

    }

}