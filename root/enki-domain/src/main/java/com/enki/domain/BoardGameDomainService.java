package com.enki.domain;

import com.enki.domain.entity.BoardGame;
import com.enki.domain.event.BoardGameEvent;

import java.util.List;


public interface BoardGameDomainService {

    BoardGameEvent create(BoardGame boardGame);

    BoardGameEvent findById(Integer id);

    List<BoardGameEvent> findAll();
}
