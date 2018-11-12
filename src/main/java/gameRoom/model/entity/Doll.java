package gameRoom.model.entity;

import gameRoom.model.enums.AgeGroup;
import gameRoom.model.enums.ChildMale;
import gameRoom.model.enums.DollType;

public class Doll extends Toy {

    private int height;
    private DollType dollType;

    public DollType getDollType() {
        return dollType;
    }
    public void setDollType(DollType dollType) {
        this.dollType = dollType;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public Doll(long id, String name, long price, AgeGroup ageGroup, ChildMale childMale, int height, DollType dollType) {
        super(id, name, price, ageGroup, childMale);
        this.height = height;
        this.dollType = dollType;
    }
}
