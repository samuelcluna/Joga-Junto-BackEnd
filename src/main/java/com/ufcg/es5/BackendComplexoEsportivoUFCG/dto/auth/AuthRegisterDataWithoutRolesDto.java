package com.ufcg.es5.BackendComplexoEsportivoUFCG.dto.auth;

import jakarta.validation.constraints.NotNull;

public record AuthRegisterDataWithoutRolesDto(
        @NotNull
        String email,
        @NotNull
        String name,
        @NotNull
        String phoneNumber,
        @NotNull
        String studentId,
        @NotNull
        String password
) {
}
