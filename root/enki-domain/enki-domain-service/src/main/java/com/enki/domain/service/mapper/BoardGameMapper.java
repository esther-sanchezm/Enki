package com.enki.domain.service.mapper;

import com.enki.domain.core.entity.BoardGame;
import com.enki.domain.service.dto.CreateBoardGameCommand;
import com.enki.domain.service.dto.CreateBoardGameResponse;

public interface BoardGameMapper {
    BoardGame toEntity(CreateBoardGameCommand createBoardGameCommand);

    CreateBoardGameResponse toDto(BoardGame boardGameCreated);
}
