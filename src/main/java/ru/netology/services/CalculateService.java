package ru.netology.services;

public class CalculateService {
    public int calculate(int income, int expenses) {
        int count = 0; // счётчик месяцев отдыха
        int threshold = 0; // количество денег на счету
        for (int month = 1; month < 12; month++) {
            if (threshold >= 150_000) { // можем ли отдыхать?
                int rest = ((threshold - expenses) - ((threshold - expenses) / 3));
                count++; // увеличиваем счётчик месяцев отдыха
                threshold = threshold - rest - expenses;
            } else {
                threshold = threshold + income - expenses;
            }
        }
        return count;
    }
}

