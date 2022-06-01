package com.switchfully.funiversity.api;

import com.switchfully.funiversity.api.dtos.CreateProfessorDto;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ProfessorControllerTest {
    @LocalServerPort
    private int port;

    @Test
    void createNewProfessor_givenANewProfessorToCreate_thenANewProfessorIsSavedAndReturned() {
        CreateProfessorDto createProfessorDto = new CreateProfessorDto()
                .setFirstName("Bob")
                .setLastName("Villain");
    }
}