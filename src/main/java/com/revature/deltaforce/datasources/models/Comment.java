package com.revature.deltaforce.datasources.models;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.net.URL;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Objects;

@Data
public class Comment {
    private String url;
    @NotBlank
    private String username;
    @NotBlank(message = "Content cannot be blank.")
    private String content;
    private Instant timePosted;

    public Comment(String url, String username, String content) {
        this.url = url;
        this.username = username;
        this.content = content;
        this.timePosted = Instant.now();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return Objects.equals(username, comment.username) && Objects.equals(content, comment.content) && Objects.equals(url, comment.url);
    }

}
