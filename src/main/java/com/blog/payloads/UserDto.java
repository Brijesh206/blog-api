package com.blog.payloads;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class UserDto {

    private int userId;

    @NotEmpty
    @Size(min = 4, max = 10, message = "Username must be min of 4 and max of 10 chars")
    private String name;

    @Email(message = "Email must be valid!")
    private String email;

//    Password must contain at least one letter,at least one number, and be longer than six characters.
    @NotEmpty
    @Size(min = 8, max = 14, message = "password must be min of 6 and max of 14 chars")
    @Pattern(regexp = "^(?=.*[0-9]+.*)(?=.*[a-zA-Z]+.*)[0-9a-zA-Z]{6,}$")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    @NotEmpty
    @Size(max = 100, message = "about must maximum of 100 chars")
    private String about;
}
