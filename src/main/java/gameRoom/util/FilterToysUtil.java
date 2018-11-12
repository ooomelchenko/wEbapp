package gameRoom.util;

import gameRoom.model.entity.Toy;
import gameRoom.model.enums.AgeGroup;
import gameRoom.model.enums.ChildMale;

import java.util.List;
import java.util.stream.Collectors;

public class FilterToysUtil {

    public static List<Toy> byMinPrice(List<Toy> toyList, Long minPrice) {
        return toyList.stream()
                .filter(toy -> toy.getPriceUSD() >= minPrice)
                .collect(Collectors.toList());
    }

    public static List<Toy> byMaxPrice(List<Toy> toyList, Long maxPrice) {
        return toyList.stream()
                .filter(toy -> toy.getPriceUSD() <= maxPrice)
                .collect(Collectors.toList());
    }

    public static List<Toy> byChildMale(List<Toy> toyList, ChildMale childMale) {
        return toyList.stream()
                .filter(toy -> toy.getChildMale().equals(childMale))
                .collect(Collectors.toList());
    }

    public static List<Toy> byAgeGroup(List<Toy> toyList, AgeGroup ageGroup) {
        return toyList.stream()
                .filter(toy -> toy.getAgeGroup().equals(ageGroup))
                .collect(Collectors.toList());
    }

}
