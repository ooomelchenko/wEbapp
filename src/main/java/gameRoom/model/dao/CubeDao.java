package gameRoom.model.dao;

import gameRoom.model.entity.Cube;

import java.sql.SQLException;
import java.util.List;

public interface CubeDao  { //extends AutoCloseable
    List<Cube> getAll() throws SQLException, ClassNotFoundException;
}
