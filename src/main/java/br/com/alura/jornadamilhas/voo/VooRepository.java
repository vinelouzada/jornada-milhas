package br.com.alura.jornadamilhas.voo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public interface VooRepository extends JpaRepository<Voo,Long> {

    @Query("""
            SELECT v 
            FROM Voo v
            WHERE
            (:origem IS NULL OR v.origem = :origem)
            AND
            (:destino IS NULL OR v.destino = :destino)
            AND
            (:precoMinimo IS NULL OR v.preco BETWEEN :precoMinimo AND :precoMaximo)
            AND
            (:horarioPartida IS NULL OR v.horarioPartida = :horarioPartida)
            AND
            (:horarioChegada IS NULL OR v.horarioChegada = :horarioChegada)
            AND
            (:periodo IS NULL OR v.periodo = :periodo)
            AND
            (:companhia IS NULL OR v.companhia = :companhia)
            AND
            (:quantidadeConexoes IS NULL OR v.quantidadeConexoes = :quantidadeConexoes)
            """)
    List<Voo> findAllByParams(@Param("origem") String origem,
                              @Param("destino") String destino,
                              @Param("precoMinimo") BigDecimal precoMinimo,
                              @Param("precoMaximo") BigDecimal precoMaximo,
                              @Param("horarioPartida") LocalDateTime horarioPartida,
                              @Param("horarioChegada") LocalDateTime horarioChegada,
                              @Param("periodo") Periodo periodo,
                              @Param("quantidadeConexoes") Integer quantidadeConexoes,
                              @Param("companhia") CompanhiaAerea companhia);
}
