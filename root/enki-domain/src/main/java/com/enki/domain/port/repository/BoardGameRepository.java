package com.enki.domain.port.repository;

import com.enki.domain.entity.BoardGame;

import java.util.List;


public interface BoardGameRepository {

    BoardGame save(BoardGame boardGame);

    BoardGame findById(Integer id);

    List<BoardGame> findAll();
}
