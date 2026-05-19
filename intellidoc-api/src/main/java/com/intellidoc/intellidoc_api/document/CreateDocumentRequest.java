package com.intellidoc.intellidoc_api.document;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CreateDocumentRequest {
    @NotBlank(message = "Filename is required")
    @Size(max=255 , message = "Filename must be atmost 255 characters")
    private String filename;

    @NotBlank(message = "Content is required")
    private String content;

    private String documentType;
}
