package am.cs322.Presentation.model;

import jakarta.annotation.Nonnull;

public record CreateUserRequest(@Nonnull
                                String firstName,
                                @Nonnull
                                String lastName) {
}
