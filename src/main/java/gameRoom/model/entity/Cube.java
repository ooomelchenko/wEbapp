package gameRoom.model.entity;


import gameRoom.model.enums.AgeGroup;
import gameRoom.model.enums.ChildMale;
import gameRoom.model.enums.CubeType;

public class Cube extends Toy {

    private int side;
    private CubeType cubeType;

    public int getSide() {
        return side;
    }
    public void setSide(int side) {
        this.side = side;
    }

    public CubeType getCubeType() {
        return cubeType;
    }
    public void setCubeType(CubeType cubeType) {
        this.cubeType = cubeType;
    }

    public Cube(long id, String name, long price, AgeGroup ageGroup, ChildMale childMale, int side, CubeType cubeType) {
        super(id, name, price, ageGroup, childMale);
        this.side = side;
        this.cubeType = cubeType;
    }
}
