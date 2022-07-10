package com.enki.infraestructure.repository.mapper;

import com.enki.domain.core.entity.BoardGame;
import com.enki.infraestructure.repository.document.BoardGameDocument;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BoardGameDocumentMapper {

    BoardGameDocument toDocument(BoardGame order);

    BoardGame toEntity(BoardGameDocument boardGameSaved);
}
