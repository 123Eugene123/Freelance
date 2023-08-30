package ru.netology.services;

public class CalculateService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0;
        for (int month = 1; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                int rest = ((threshold - expenses) - ((threshold - expenses) / 3));
                count++; // увеличиваем счётчик месяцев отдыха
                money = money - rest - expenses;
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}

