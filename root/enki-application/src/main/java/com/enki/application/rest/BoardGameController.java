package com.enki.application.rest;

import com.enki.domain.service.dto.CreateBoardGameCommand;
import com.enki.domain.service.dto.CreateBoardGameResponse;
import com.enki.domain.service.port.input.BoardGameService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class BoardGameController {

    private final BoardGameService boardGameService;

    @PostMapping
    public ResponseEntity<CreateBoardGameResponse> create(@RequestBody CreateBoardGameCommand createBoardGameCommand) {
        var createBoardGameResponse = boardGameService.create(createBoardGameCommand);
        return ResponseEntity.ok(createBoardGameResponse);
    }


}
