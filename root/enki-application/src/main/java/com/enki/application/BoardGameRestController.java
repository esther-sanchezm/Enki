package com.enki.application;

import com.enki.domain.entity.BoardGame;
import com.enki.domain.BoardGameDomainService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BoardGameRestController {

    private final BoardGameDomainService boardGameService;

    public BoardGame create() {
        boardGameService.create();
    }
}
