package com.enki.domain.service;

import com.enki.domain.service.dto.CreateBoardGameCommand;
import com.enki.domain.service.dto.CreateBoardGameResponse;
import com.enki.domain.service.port.input.BoardGameService;

class BoardGameServiceImpl implements BoardGameService {

    private BoardGameCreateCommandHandler boardGameCreateCommandHandler;

    @Override
    public CreateBoardGameResponse create(CreateBoardGameCommand boardGameCommand) {
        return boardGameCreateCommandHandler.create(boardGameCommand);
    }
}
