package ru.itgirl.first_spring_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.itgirl.first_spring_project.model.DayOfWeek;

@RestController
public class FirstController {

    @GetMapping("/day")
    public String getDayInRussian(@RequestParam(value = "day") String day) {
        try {
            DayOfWeek dayOfWeek = DayOfWeek.valueOf(day.toUpperCase());
            return String.format("Сегодня %s", dayOfWeek.getRussianName());
        } catch (IllegalArgumentException e) {
            return  String.format("Некорректный день недели: " + day +
                    ". Пожалуйста, используйте: MONDAY, TUESDAY, WEDNESDAY, " +
                    "THURSDAY, FRIDAY, SATURDAY, SUNDAY.");
        }
    }
}
