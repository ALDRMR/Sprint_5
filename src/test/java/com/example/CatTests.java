package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class CatTests {

    @Mock
    Feline feline;

    @Test
    public void getSoundShouldReturnMeow() {
        Cat cat = new Cat(feline);
        assertEquals("Мяу", cat.getSound(), "Не корректный звук");
    }

    @Test
    public void getFoodShouldReturnMeat() throws Exception {
        List<String> meatFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(meatFood);
        Cat cat = new Cat(feline);
        assertEquals(meatFood, cat.getFood(), "Список еды должен совпадать с тем, что возвращает метод eatMeat()");
    }
}
