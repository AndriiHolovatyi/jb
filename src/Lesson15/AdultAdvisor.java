package Lesson15;

public class AdultAdvisor implements WeekAdvisor {
    @Override
    public String advise(Day day) {
        return switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY ->
                    "Доросла порада: Ходи на роботу, сфокусуйся на ключових завданнях.";
            case FRIDAY ->
                    "Доросла порада: У п'ятницю відпочинь після роботи та лягай спати раніше.";
            case SATURDAY, SUNDAY ->
                    "Доросла порада: На вихідних прокинься раніше, приготуй їжі, прибери в хаті та подзвони батькам.";
        };
    }
}
