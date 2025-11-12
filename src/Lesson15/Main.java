package Lesson15;

import java.util.Arrays; // Імпортуємо для використання Day.values()

public class Main {
    public static void main(String[] args) {


        WeekAdvisor adultAdvisor = new AdultAdvisor();
        WeekAdvisor schoolAdvisor = new SchoolAdvisor();
        WeekAdvisor childAdvisor = new ChildAdvisor();


        Day[] allDays = Day.values();
//дорослі
        for (Day day : allDays) {
            System.out.printf("%-10s: %s%n", day.name(), adultAdvisor.advise(day));
        }
//школярі
        for (Day day : allDays) {
            System.out.printf("%-10s: %s%n", day.name(), schoolAdvisor.advise(day));
        }

//діти
        for (Day day : allDays) {
            System.out.printf("%-10s: %s%n", day.name(), childAdvisor.advise(day));
        }
    }
}
