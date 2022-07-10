package com.enki.domain.core;

import com.enki.domain.core.event.BoardGameEvent;
import com.enki.domain.core.entity.BoardGame;

import java.util.List;


public interface BoardGameDomainService {

    BoardGameEvent create(BoardGame boardGame);

    BoardGameEvent findById(Integer id);

    List<BoardGameEvent> findAll();
}
