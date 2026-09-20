package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class LionNotParameterizedTests {

    @Mock
    Feline feline;

    @Test
    public void lionConstructorTestInvalidSexThrowsProperExceptionMessage() {
        Exception exception = assertThrows(Exception.class, () -> new Lion("неправильная строка", feline));
        assertEquals(
                "Используйте допустимые значения пола животного - самец или самка",
                exception.getMessage(),
                "Не правильное сообщение об ошибке"
        );
    }

    @Test
    public void lionGetKittensCountTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(3);
        int actualKittens = lion.getKittens();
        assertEquals(3, actualKittens, "Количество детей должно быть таким же как передано в Feline");
    }

    @Test
    public void lionGetFoodShouldReturnPredatorFood() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedFood);
        List<String> actualFood = lion.getFood();
        assertEquals(expectedFood, actualFood, "Список еды должен совпадать с ответом Feline getFood Хищник");
    }
}
