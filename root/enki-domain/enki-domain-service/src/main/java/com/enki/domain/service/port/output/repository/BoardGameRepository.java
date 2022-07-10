package com.enki.domain.service.port.output.repository;

import com.enki.domain.core.entity.BoardGame;

public interface BoardGameRepository {

    BoardGame create(BoardGame order);

    BoardGame findByName(String name);
}
