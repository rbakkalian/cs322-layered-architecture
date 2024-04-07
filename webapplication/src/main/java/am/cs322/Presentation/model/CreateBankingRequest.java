package am.cs322.Presentation.model;

import jakarta.annotation.Nonnull;

public record CreateBankingRequest(@Nonnull long id, @Nonnull boolean isDebit) {
}
