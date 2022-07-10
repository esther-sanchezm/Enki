package com.enki.domain.service.port.output;

import com.enki.domain.core.entity.BoardGame;

import java.util.Optional;

public interface BoardGameRepository {

    BoardGame create(BoardGame order);

    Optional<BoardGame> findByName(String name);
}
