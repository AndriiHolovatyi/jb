package Lesson15;

public class ChildAdvisor implements WeekAdvisor {
    @Override
    public String advise(Day day) {
        return switch (day) {
            case MONDAY -> "Дитяча порада: Подивись 'Баффі..' на Новому каналі.";
            case TUESDAY -> "Дитяча порада: Подивись Сімпсони на M1.";
            case WEDNESDAY -> "Дитяча порада: Почитай книжку перед сном.";
            case THURSDAY -> "Дитяча порада: Уроки малювання о 18:00.";
            case FRIDAY -> "Дитяча порада: Подивись 'Малкольм..' на Новому каналі.";
            case SATURDAY, SUNDAY -> "Дитяча порада: гуляй на свіжому повітрі, слухайся батьків.";
        };
    }
}
