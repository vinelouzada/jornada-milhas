package br.com.alura.jornadamilhas.voo;

import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record DadosCadastroVoo(Integer numero_voo, String origem, String destino, LocalDateTime horarioPartida, LocalDateTime horarioChegada, Integer quantidadeConexoes) {
}
