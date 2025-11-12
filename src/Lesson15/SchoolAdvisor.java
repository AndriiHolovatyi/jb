package Lesson15;

public class SchoolAdvisor implements WeekAdvisor {
    @Override
    public String advise(Day day) {
        return switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY ->
                    "Шкільна порада: Ходи до школи, роби домашнє завдання ввечері.";
            case FRIDAY ->
                    "Шкільна порада: Збери портфель на понеділок, відпочинь.";
            case SATURDAY, SUNDAY ->
                    "Шкільна порада: Роби домашнє завдання, пограй у Доту та виспись.";
        };
    }
}
