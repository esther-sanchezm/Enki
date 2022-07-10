package com.enki.common.event.emitter;

import com.enki.common.event.DomainEvent;

public interface DomainEventEmitter<T extends DomainEvent> {

    T emitter(T domainEvent);
}
