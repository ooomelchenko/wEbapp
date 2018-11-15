package gameRoom.model.dao;

import gameRoom.model.entity.Doll;

import java.sql.SQLException;
import java.util.List;

public interface DollDao  { //extends AutoCloseable
    List<Doll> getAll() throws SQLException, ClassNotFoundException;
}
