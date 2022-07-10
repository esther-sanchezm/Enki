package com.enki.domain.service.port.output.message.emitter;

import com.enki.common.event.emitter.DomainEventEmitter;
import com.enki.domain.core.event.BoardGameEvent;

public interface BoardGameMessageEmitter extends DomainEventEmitter<BoardGameEvent> {
}
