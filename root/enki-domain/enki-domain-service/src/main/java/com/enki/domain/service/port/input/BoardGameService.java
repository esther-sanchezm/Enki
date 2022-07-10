package com.enki.domain.service.port.input;

import com.enki.domain.service.dto.CreateBoardGameCommand;
import com.enki.domain.service.dto.CreateBoardGameResponse;

public interface BoardGameService {

    CreateBoardGameResponse create(CreateBoardGameCommand boardGameCommand);
}
