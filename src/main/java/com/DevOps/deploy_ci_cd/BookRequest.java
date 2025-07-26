package com.DevOps.deploy_ci_cd;

import java.util.UUID;

public class BookRequest {
    private UUID id; // Not needed on creation, but included for completeness
    private String title;
    private String author;

    // Getters & Setters
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
}
