package com.enki.domain.event;

import com.enki.common.aggregationroot.AggregationRoot;
import com.enki.common.event.ActionDomain;
import com.enki.common.event.DomainEvent;
import com.enki.domain.entity.BoardGame;
import lombok.*;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class BoardGameEvent extends DomainEvent<BoardGame> {

    public BoardGameEvent(AggregationRoot entity, ActionDomain action) {
        super(entity, action, ZonedDateTime.now(ZoneId.of("UTC")));
    }

    public static BoardGameEvent of(BoardGame boardGame, ActionDomain action) {
        return new BoardGameEvent(boardGame, action);
    }
}
