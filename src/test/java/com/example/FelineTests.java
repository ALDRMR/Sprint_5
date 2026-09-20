package com.example;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FelineTests {

    @Test
    public void eatMeatShouldReturnPredatorFood() throws Exception {
        Feline feline = new Feline();
        assertEquals(List.of("Животные", "Птицы", "Рыба"),
                feline.eatMeat(),
                "Метод eatMeat должен возвращать список еды хищника");
    }

    @Test
    public void getFamilyShouldReturnFamilyCat() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily(), "Метод должен вернуть строку Кошачьи");
    }

    @Test
    public void getKittensShouldReturnDefaultCount() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens(), "Количество котят по умолчанию должно быть 1");
    }

    @Test
    public void getKittensShouldReturnPassedValue() {
        Feline feline = new Feline();
        int expectedCount = 7;
        assertEquals(expectedCount, feline.getKittens(expectedCount), "Метод должен возвращать переданное количество котят");
    }
}
