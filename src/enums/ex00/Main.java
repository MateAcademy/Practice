package enums.ex00;

import java.util.EnumSet;

/**
 * Обьединение значений enum по смыслу
 * например, группировка дней недели: рабочие дни, выходные
 * используется для того что бы динамично оьединить какието значения(перечисления), например по цветам
 * @author Serhii Klunniy
 */
public class Main {
    public static void main(String[] args) {
        EnumSet<WeekDay> days = EnumSet.of(WeekDay.MONDAY, WeekDay.THURSDAY, WeekDay.WEDNESDAY, WeekDay.THURSDAY, WeekDay.FRIDAY);
        EnumSet<WeekDay> holidays = EnumSet.of(WeekDay.SUNDAY, WeekDay.SATURDAY);
    }
}
