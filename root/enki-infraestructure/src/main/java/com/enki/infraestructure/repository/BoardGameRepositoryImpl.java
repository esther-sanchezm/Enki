package com.enki.infraestructure.repository;

import com.enki.common.exception.EntityNoExistException;
import com.enki.domain.service.port.output.repository.BoardGameRepository;
import com.enki.domain.core.entity.BoardGame;
import com.enki.infraestructure.repository.document.BoardGameDocument;
import com.enki.infraestructure.repository.mapper.BoardGameDocumentMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BoardGameRepositoryImpl implements BoardGameRepository {

    private final BoardGameDocumentMapper boardGameDocumentMapper;

    private final BoardGameMongoRepository boardGameMongoRepository;

    @Override
    public BoardGame create(BoardGame boardGame) {
        var boardGameDocument = boardGameDocumentMapper.toDocument(boardGame);
        var boardGameSaved = boardGameMongoRepository.save(boardGameDocument);
        return boardGameDocumentMapper.toEntity(boardGameSaved);
    }

    @Override
    public BoardGame findByName(String name) {
        Optional<BoardGameDocument> optionalBoardDocument = boardGameMongoRepository.findByName(name);
        var boardGame = optionalBoardDocument
                .orElseThrow(() -> new EntityNoExistException(BoardGame.class.getName(), "name", name));
        return boardGameDocumentMapper.toEntity(boardGame);
    }
}
