package com.enki.domain.entity;

import com.enki.common.aggregationroot.AggregationRoot;
import com.enki.domain.valueobject.Image;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class BoardGame extends AggregationRoot {

    private Integer id;

    private String name;

    private String description;

    private Image image;

    private BoardGameStatus status;

    public BoardGame inactive() {
        this.status = BoardGameStatus.INACTIVE;
        return this;
    }

    public BoardGame initializeBoardGame() {
        this.status = BoardGameStatus.ACTIVE;
        return this;
    }
}
