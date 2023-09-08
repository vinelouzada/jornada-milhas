package br.com.alura.jornadamilhas.voo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record FiltroPesquisaDto(String origem, String destino, LocalDateTime horarioPartida,
                                LocalDateTime horarioChegada, Integer quantidadeConexoes,
                                CompanhiaAerea companhia, BigDecimal precoMinimo, BigDecimal precoMaximo,
                                Periodo periodo) {
}