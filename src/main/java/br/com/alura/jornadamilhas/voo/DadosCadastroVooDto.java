package br.com.alura.jornadamilhas.voo;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record DadosCadastroVooDto(
        @NotNull
        Integer numeroVoo,
        @NotBlank
        @Pattern(regexp = "[A-Z]{3}")
        String origem,
        @NotBlank
        @Pattern(regexp = "[A-Z]{3}")
        String destino,
        @NotNull
        @Future
        LocalDateTime horarioPartida,
        @NotNull
        @Future
        LocalDateTime horarioChegada,
        @NotNull
        Integer quantidadeConexoes,

        @NotNull
        CompanhiaAerea companhiaAerea,

        @NotNull
        BigDecimal preco
) {
}
