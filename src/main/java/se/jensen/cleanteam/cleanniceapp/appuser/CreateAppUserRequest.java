package se.jensen.cleanteam.cleanniceapp.appuser;

import jakarta.validation.constraints.*;

public record CreateAppUserRequest(

        @NotBlank(message = "Firstname is required")
        String firstname,

        @NotBlank(message = "Lastname is required")
        String lastname,

        @NotBlank(message = "Email is required")
        @Email(message = "Email must be valid")
        String email,

        @NotBlank(message = "Password is required")
        @Size(min = 12, message = "Password must be at least 12 characters")
        @Pattern(
                regexp = "^(?=.*[A-Z])(?=.*[^a-zA-Z0-9]).+$",
                message = "Password must contain at least one uppercase letter and one special character"
        )
        String password,
        @NotNull(message = "Role is required")
        AppUserRole role
) {
}
