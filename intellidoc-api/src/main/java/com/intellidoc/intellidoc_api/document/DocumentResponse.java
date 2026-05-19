package com.intellidoc.intellidoc_api.document;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DocumentResponse {
    private Long id;
    private String filename;
    private String content;
    private LocalDateTime uploadDate;
    private String documentType;

    public static DocumentResponse fromEntity(Document document) {
        return DocumentResponse.builder()
                .id(document.getId())
                .filename(document.getFilename())
                .content(document.getContent())
                .uploadDate(document.getUploadDate())
                .documentType(document.getDocumentType())
                .build();
    }

}
