package br.com.alura.jornadamilhas.voo;

import java.time.LocalDateTime;

public record DadosCadastroVooDto(
        Integer numeroVoo,
        String origem,
        String destino,
        LocalDateTime horarioPartida,
        LocalDateTime horarioChegada,
        Integer quantidadeConexoes
) {
}
