package com.enki.infraestructure.rest;

import com.enki.application.usecase.BoardGameCreateCommandHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BoardGameRestController {

    private final BoardGameCreateCommandHandler boardGameCreateCommandHandler;
}
