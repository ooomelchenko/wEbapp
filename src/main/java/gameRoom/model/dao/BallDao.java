package gameRoom.model.dao;

import gameRoom.model.entity.Ball;

import java.sql.SQLException;
import java.util.List;

public interface BallDao {
    List<Ball> getAll() throws SQLException, ClassNotFoundException;
}
