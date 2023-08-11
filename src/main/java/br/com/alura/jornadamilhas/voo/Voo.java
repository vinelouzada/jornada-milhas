package br.com.alura.jornadamilhas.voo;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
    @NotBlank
    private Integer numeroVoo;
    @NotBlank
    private String origem;
    @NotBlank
    private String destino;
    @NotBlank
    private LocalDateTime horarioPartida;
    @NotBlank
    private LocalDateTime horarioChegada;
    @NotBlank
    private Integer quantidadeConexoes;


    public Voo(DadosCadastroVooDto dados){
        this.numeroVoo = dados.numeroVoo();
        this.origem = dados.origem();
        this.destino = dados.destino();
        this.horarioPartida = dados.horarioPartida();
        this.horarioChegada = dados.horarioChegada();
        this.quantidadeConexoes = dados.quantidadeConexoes();
    }
}
