package com.intellidoc.intellidoc_api.document;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface DocumentRepository extends JpaRepository<Document,Long> {
    List<Document> findByDocumentType(String documentType);
    List<Document> findByFilenameContainingIgnoreCase(String filenameFragment);
}
