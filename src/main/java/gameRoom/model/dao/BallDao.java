package gameRoom.model.dao;

import gameRoom.model.entity.Ball;

import java.sql.SQLException;
import java.util.List;

public interface BallDao  { //extends AutoCloseable
    List<Ball> getAll() throws SQLException, ClassNotFoundException;
}
