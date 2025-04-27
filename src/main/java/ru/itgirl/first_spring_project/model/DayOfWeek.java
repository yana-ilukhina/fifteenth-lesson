package ru.itgirl.first_spring_project.model;

public enum DayOfWeek {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");

    private final String russianName; // Строка

    DayOfWeek(String russianName) { // конструктор
        this.russianName = russianName;
    }

    public String getRussianName() { // геттер
        return russianName;
    }

    @Override
    public String toString() { // переобозначение метода toString
        return "DayOfWeek{" +
                "title='" + russianName + '\'' + '}';
    }
}

