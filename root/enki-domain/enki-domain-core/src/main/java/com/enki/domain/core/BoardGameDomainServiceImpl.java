package com.enki.domain.core;

import com.enki.common.event.ActionDomain;
import com.enki.domain.core.event.BoardGameEvent;
import com.enki.domain.core.entity.BoardGame;

import java.util.List;


public class BoardGameDomainServiceImpl implements BoardGameDomainService {

    public BoardGameEvent create(BoardGame boardGame) {
        validate(boardGame);
        boardGame.initializeBoardGame();
        return BoardGameEvent.of(boardGame, ActionDomain.CREATED);
    }

    public BoardGameEvent findById(Integer id) {
        return null;
    }

    public List<BoardGameEvent> findAll() {
        return null;
    }

    private void validate(BoardGame boardGame) {

    }

}
