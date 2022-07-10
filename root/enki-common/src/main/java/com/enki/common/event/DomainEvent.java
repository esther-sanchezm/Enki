package com.enki.common.event;

import com.enki.common.aggregationroot.AggregationRoot;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
@AllArgsConstructor
public abstract class DomainEvent<T extends AggregationRoot> {

    private AggregationRoot entity;

    private ActionDomain action;

    private ZonedDateTime createdAt;

}
