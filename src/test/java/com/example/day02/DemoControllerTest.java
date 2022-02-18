package com.example.day02;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.boot.test.context.SpringBootTest.*;
import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class DemoControllerTest {

    @Autowired
    TestRestTemplate restTemplate;

    @MockBean
    private DemoService demoService;

    @Test
    void xxxx() {
        // Arrange
        when(demoService.process(100)).thenReturn("Result with id = 100");
        // Act
        DemoResponse result = restTemplate.getForObject("/demo/100",DemoResponse.class);
        // Assert
        assertEquals(100, result.getCode());
        assertEquals("Result with id = 100",result.getMessage());
    }
}