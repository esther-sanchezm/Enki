package com.enki.infraestructure.repository;

import com.enki.infraestructure.repository.document.BoardGameDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BoardGameMongoRepository extends MongoRepository<BoardGameDocument, Integer> {

    Optional<BoardGameDocument> findByName(String name);
}
