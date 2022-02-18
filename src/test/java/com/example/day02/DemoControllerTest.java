package com.example.day02;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.boot.test.context.SpringBootTest.*;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class DemoControllerTest {

    @Autowired
    TestRestTemplate restTemplate;

    @Test
    void xxxx() {
        // Act
        DemoResponse result = restTemplate.getForObject("/demo/1",DemoResponse.class);
        // Assert
        assertEquals(0, result.getCode());
        assertNull(result.getMessage());
    }
}