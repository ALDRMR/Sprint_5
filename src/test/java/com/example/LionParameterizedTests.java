package com.example;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class LionParameterizedTests {

    @Mock
    Feline feline;

    @ParameterizedTest(name = "Для пола {0} doesHaveMane должно быть {1}")
    @CsvSource({
            "Самец, true",
            "Самка, false"
    })
    public void lionConstructorTestManePresence(String sex, boolean expectedHasMane) throws Exception {
        Lion lion = new Lion(sex, feline);
        assertEquals(expectedHasMane, lion.doesHaveMane(), "Для пола {0} doesHaveMane должно быть {1}");
    }
}
