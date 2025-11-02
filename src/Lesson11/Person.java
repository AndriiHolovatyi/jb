package Lesson11;

public class Person {

    private String name;
    private String profession;
    private int age;

    public Person(String name, int age, String profession) {
        this.name = name;
        this.profession = profession;
        this.age = age;
    }

    public String toString(){
        return "Ім'я: " + name + ", Вік: " + age + ", Професія: " + profession;
    }

    public void setProfession(String profession) {
        System.out.println("(Після оновлення професії)");
        this.profession = profession;
    }

    static void main(String[] args) {
        Person person1 = new Person("John", 30, "Інженер");
        Person person2 = new Person("Mary", 25, "Вчитель");
        Person person3 = new Person("Bob", 35, "Лікар");
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);


        String newLine = System.lineSeparator();
        System.out.println(newLine);


        Person person4 = new Person ("Alice", 28, "Архітектор");
        System.out.println(person4);
        person4.setProfession("Дизайнер");
        System.out.println(person4);
    }
}
