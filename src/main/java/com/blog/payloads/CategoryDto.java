package com.blog.payloads;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDto {

    private int categoryId;

    @NotEmpty
    @Size(min = 4, max = 10, message = "min size of category title is 4 and max is 10")
    private String title;

    @NotEmpty
    @Size(max = 100, message = "max size of category description is 100")
    private String description;
}
