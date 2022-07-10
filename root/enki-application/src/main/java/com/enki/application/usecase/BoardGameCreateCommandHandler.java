package com.enki.application.usecase;

import com.enki.common.event.ActionDomain;
import com.enki.domain.core.event.BoardGameEvent;
import com.enki.domain.service.dto.CreateBoardGameCommand;
import com.enki.domain.service.dto.CreateBoardGameResponse;
import com.enki.domain.service.mapper.BoardGameMapper;
import com.enki.domain.service.port.input.BoardGameService;
import com.enki.domain.service.port.output.repository.BoardGameRepository;
import com.enki.domain.service.port.output.message.emitter.BoardGameMessageEmitter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BoardGameCreateCommandHandler implements BoardGameService  {

    private final BoardGameMapper boardGameMapper;

    private final BoardGameRepository boardGameRepository;

    private final BoardGameMessageEmitter boardGameMessageEmitter;

    public CreateBoardGameResponse create(CreateBoardGameCommand createBoardGameCommand) {
        var boardGame = boardGameMapper.toEntity(createBoardGameCommand);
        var boardGameCreated = boardGameRepository.create(boardGame);
        boardGameMessageEmitter.emitter(BoardGameEvent.of(boardGameCreated, ActionDomain.CREATED));
        return boardGameMapper.toDto(boardGameCreated);
    }
}
