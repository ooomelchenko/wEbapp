package gameRoom.model.entity;

import gameRoom.model.enums.AgeGroup;
import gameRoom.model.enums.ChildMale;


public abstract class Toy {

    private long id;
    private String name;
    private Long priceUSD; //in coins

    private AgeGroup ageGroup;
    private ChildMale childMale;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Long getPriceUSD() {
        return priceUSD;
    }
    public void setPriceUSD(Long priceUSD) {
        this.priceUSD = priceUSD;
    }

    public AgeGroup getAgeGroup() {
        return ageGroup;
    }
    public void setAgeGroup(AgeGroup ageGroup) {
        this.ageGroup = ageGroup;
    }

    public ChildMale getChildMale() {
        return childMale;
    }
    public void setChildMale(ChildMale childMale) {
        this.childMale = childMale;
    }

    public Toy(Long id, String name, Long price, AgeGroup ageGroup, ChildMale childMale) {
        this.id = id;
        this.name = name;
        this.priceUSD = price;
        this.ageGroup = ageGroup;
        this.childMale = childMale;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", priceUSD=" + priceUSD +
                ", ageGroup=" + ageGroup +
                ", childMale=" + childMale +
                '}';
    }
}
