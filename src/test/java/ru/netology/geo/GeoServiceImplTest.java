package ru.netology.geo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import org.mockito.Spy;
import ru.netology.entity.Country;

import static org.junit.jupiter.api.Assertions.*;

class GeoServiceImplTest {
    GeoServiceImpl geoService;

    @BeforeEach
    void setup() {
        geoService = spy(GeoServiceImpl.class);
    }

    @Test
    void testByIpRus() {
        assertEquals(Country.RUSSIA, geoService.byIp(GeoServiceImpl.MOSCOW_IP).getCountry());
    }

    @Test
    void testByIpEng() {
        assertEquals(Country.USA, geoService.byIp(GeoServiceImpl.NEW_YORK_IP).getCountry());
    }

}
