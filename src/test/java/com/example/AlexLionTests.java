package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class AlexLionTests {

    @Mock
    Feline feline;

    @Test
    void alexLionConstructorTestManePresence() throws Exception {
        AlexLion alex = new AlexLion(feline);
        assertTrue(alex.doesHaveMane(), "Алекс - самец, должна быть грива");
    }
}
