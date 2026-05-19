# IntelliDoc API

Intelligent Document Processing API for financial services. Built with Spring Boot, PostgreSQL, and OpenAI GPT-4o-mini.

A REST API that ingests financial documents (loan applications, bank statements, invoices), extracts structured data using LLMs, and answers natural-language questions about document content using retrieval-augmented generation.

## Features

- [x] Project scaffolding and health endpoint
- [x] PostgreSQL integration with JPA
- [x] Document entity and CRUD REST API
- [ ] PDF upload and text extraction (Day 3)
- [ ] LLM-powered structured data extraction (Day 4)
- [ ] Natural-language Q&A with RAG (Week 2)
- [ ] JWT authentication (Week 2)
- [ ] Anomaly detection (Week 3)
- [ ] Dockerized deployment (Week 4)

## Tech Stack

- Java 21, Spring Boot 3.3
- PostgreSQL 16
- OpenAI API (gpt-4o-mini)
- Apache PDFBox for PDF text extraction
- Spring Security with JWT
- Docker