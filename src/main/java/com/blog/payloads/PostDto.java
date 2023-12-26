package com.blog.payloads;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class PostDto {

    private String postId;

    @NotEmpty
    @Size(min = 4)
    private String postTitle;

    @NotEmpty
    @Size(max = 1000)
    private String content;

    private String imageName;

    private Date postDate;

    private CategoryDto category;

    private UserDto user;

}
