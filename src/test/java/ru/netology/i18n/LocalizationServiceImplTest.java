package ru.netology.i18n;

import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;

import static org.junit.jupiter.api.Assertions.*;

class LocalizationServiceImplTest {

    @Test
    void testLocaleRussia() {
        LocalizationService localizationService = new LocalizationServiceImpl();
        Country russia = Country.RUSSIA;
        String actualMessage = localizationService.locale(russia);
        String expectedMessage = "Добро пожаловать";

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void testLocaleGerman() {
        LocalizationService localizationService = new LocalizationServiceImpl();
        Country russia = Country.GERMANY;
        String actualMessage = localizationService.locale(russia);
        String expectedMessage = "Welcome";
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void testLocaleUSA() {
        LocalizationService localizationService = new LocalizationServiceImpl();
        Country russia = Country.USA;
        String actualMessage = localizationService.locale(russia);
        String expectedMessage = "Welcome";
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void testLocaleBrazil() {
        LocalizationService localizationService = new LocalizationServiceImpl();
        Country russia = Country.BRAZIL;
        String actualMessage = localizationService.locale(russia);
        String expectedMessage = "Welcome";
        assertEquals(expectedMessage, actualMessage);
    }
}
