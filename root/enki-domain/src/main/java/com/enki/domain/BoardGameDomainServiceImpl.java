package com.enki.domain;

import com.enki.common.event.ActionDomain;
import com.enki.domain.entity.BoardGame;
import com.enki.domain.event.BoardGameEvent;

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
