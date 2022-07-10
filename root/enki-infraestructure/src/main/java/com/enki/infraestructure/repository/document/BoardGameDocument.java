package com.enki.infraestructure.repository.document;

import com.enki.domain.core.valueobject.Image;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "board_game")
public class BoardGameDocument {

    @Id
    private Integer id;

    private String name;

    private String description;

    private Image image;

    private Integer statusId;

}
