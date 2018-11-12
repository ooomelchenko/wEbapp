package gameRoom.model.entity;

import gameRoom.model.enums.AgeGroup;
import gameRoom.model.enums.BallType;
import gameRoom.model.enums.ChildMale;


public class Ball extends Toy {

    private int diametrMM ;
    private BallType ballType;

    public int getDiametrMM() {
        return diametrMM;
    }
    public void setDiametrMM(int diametrMM) {
        this.diametrMM = diametrMM;
    }

    public BallType getBallType() {
        return ballType;
    }
    public void setBallType(BallType ballType) {
        this.ballType = ballType;
    }

    public Ball(long id, String name, long price, AgeGroup ageGroup, ChildMale childMale, int diametrMM, BallType ballType) {
        super(id, name, price, ageGroup, childMale);
        this.diametrMM = diametrMM;
        this.ballType = ballType;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "id="+ super.getId()+
                ", name="+ super.getName()+
                ", priceUSD="+ super.getPriceUSD()+
                ", AgeGroup="+ super.getAgeGroup()+
                ", ChildMale="+ super.getChildMale()+
                ", diametrMM=" + diametrMM +
                ", ballType=" + ballType +
                '}';
    }
}
