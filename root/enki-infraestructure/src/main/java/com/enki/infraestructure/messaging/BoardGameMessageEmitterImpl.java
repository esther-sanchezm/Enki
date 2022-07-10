package com.enki.infraestructure.messaging;

import com.enki.common.event.emitter.DomainEventEmitter;
import com.enki.domain.core.event.BoardGameEvent;
import com.enki.domain.service.port.output.message.emitter.BoardGameMessageEmitter;

public class BoardGameMessageEmitterImpl implements BoardGameMessageEmitter {

    @Override
    public BoardGameEvent emitter(BoardGameEvent domainEvent) {
        return null;
    }
}
