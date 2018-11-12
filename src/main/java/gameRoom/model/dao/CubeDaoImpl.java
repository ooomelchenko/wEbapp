package gameRoom.model.dao;

import gameRoom.model.entity.Cube;
import gameRoom.model.enums.AgeGroup;
import gameRoom.model.enums.CubeType;
import gameRoom.model.enums.ChildMale;
import gameRoom.util.JDBCFactoryMySQL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CubeDaoImpl implements CubeDao {

    @Override
    public List<Cube> getAll() throws SQLException, ClassNotFoundException {
        List<Cube> resultList = new ArrayList<>();

        try (Connection connection = JDBCFactoryMySQL.getConnection()) {

            ResultSet res = connection.createStatement().executeQuery("select * from cubes");

            while (res.next()) {
                long id = res.getLong("id");
                String name = res.getString("name");
                int priceUSD = res.getInt("priceUSD");
                AgeGroup ageGroup = AgeGroup.valueOf(res.getString("ageGroup"));
                ChildMale childMale = ChildMale.valueOf(res.getString("childMale"));
                int side = res.getInt("side");
                CubeType cubeType = CubeType.valueOf(res.getString("cubeType"));

                resultList.add(new Cube(id, name, priceUSD, ageGroup, childMale, side, cubeType));
            }
        }
        return resultList;

    }
}
