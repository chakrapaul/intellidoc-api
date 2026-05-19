package com.intellidoc.intellidoc_api.document;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name="documents")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String filename;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String content;

    @Column(name = "upload_date", nullable = false)
    private LocalDateTime uploadDate;

    @Column(name = "document_type")
    private String documentType;

    @PrePersist
    protected void onCreate() {
        this.uploadDate = LocalDateTime.now();
    }

}
