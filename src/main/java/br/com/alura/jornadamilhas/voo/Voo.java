package br.com.alura.jornadamilhas.voo;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Table(name = "voos")
@Entity(name = "Voo")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Voo {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer numeroVoo;
    private String origem;
    private String destino;
    private LocalDateTime horarioPartida;
    private LocalDateTime horarioChegada;
    private Integer quantidadeConexoes;
}
