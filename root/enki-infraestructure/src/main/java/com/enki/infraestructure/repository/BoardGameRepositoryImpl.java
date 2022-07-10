package com.enki.infraestructure.repository;

import com.enki.domain.service.port.output.repository.BoardGameRepository;
import com.enki.domain.core.entity.BoardGame;
import java.util.Optional;


public class BoardGameRepositoryImpl implements BoardGameRepository {

    @Override
    public BoardGame create(BoardGame order) {
        return null;
    }

    @Override
    public Optional<BoardGame> findByName(String name) {
        return Optional.empty();
    }
}
