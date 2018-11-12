package gameRoom.model.dao;

import gameRoom.model.entity.Doll;
import gameRoom.model.enums.AgeGroup;
import gameRoom.model.enums.ChildMale;
import gameRoom.model.enums.DollType;
import gameRoom.util.JDBCFactoryMySQL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DollDaoImpl implements DollDao {

    @Override
    public List<Doll> getAll() throws SQLException, ClassNotFoundException {
        List<Doll> resultList = new ArrayList<>();

        try (Connection connection = JDBCFactoryMySQL.getConnection()) {

            ResultSet res = connection.createStatement().executeQuery("select * from dolls");

            while (res.next()) {
                long id = res.getLong("id");
                String name = res.getString("name");
                int priceUSD = res.getInt("priceUSD");
                AgeGroup ageGroup = AgeGroup.valueOf(res.getString("ageGroup"));
                ChildMale childMale = ChildMale.valueOf(res.getString("childMale"));
                int height = res.getInt("height");
                DollType dollType = DollType.valueOf(res.getString("dollType"));

                resultList.add(new Doll(id, name, priceUSD, ageGroup, childMale, height, dollType));
            }
        }
        return resultList;

    }
}
