package com.enki.domain.core.port.repository;

import com.enki.domain.core.entity.BoardGame;

import java.util.List;


public interface BoardGameRepository {

    BoardGame save(BoardGame boardGame);

    BoardGame findById(Integer id);

    List<BoardGame> findAll();
}
