package enums.ex01;

import java.util.*;

/**
 * @author Serhii Klunniy
 * Описание EnumMap
 * Ключ - значение enum (какой-либо тип enum)
 * Значение - любой обьект
 * Напирмер: группировка коллекций по типам
 */
public class Start {
    public static void main(String[] args) {
        List<Car> minivanCars = new ArrayList<>();
        minivanCars.add(new Car("Toyota"));
        minivanCars.add(new Car("BMW"));

        List<Car> sportCars = new ArrayList<>();
        sportCars.add(new Car("Lexus"));
        sportCars.add(new Car("Audi"));

        EnumMap<CarType, List<Car>> enumMap = new EnumMap<>(CarType.class);
        enumMap.put(CarType.MINIVAN, minivanCars);
        enumMap.put(CarType.SPORT, sportCars);

        iterateMap(enumMap);
    }

    private static void iterateMap(Map map) {
        Iterator<Map.Entry<CarType, List<Car>>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<CarType, List<Car>> carEntry =  iterator.next();
            System.out.println(carEntry.getKey() + " - " + carEntry.getValue());
        }

    }
}
