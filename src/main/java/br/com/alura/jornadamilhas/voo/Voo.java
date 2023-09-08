package br.com.alura.jornadamilhas.voo;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
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

    @Enumerated(EnumType.STRING)
    private CompanhiaAerea companhia;

    private BigDecimal preco;

    @Enumerated(EnumType.STRING)
    private Periodo periodo;

    public Voo(DadosCadastroVooDto dados) {
        this.numeroVoo = dados.numeroVoo();
        this.origem = dados.origem();
        this.destino = dados.destino();
        this.horarioPartida = dados.horarioPartida();
        this.horarioChegada = dados.horarioChegada();
        this.quantidadeConexoes = dados.quantidadeConexoes();
        this.preco = dados.preco();
        this.companhia = dados.companhiaAerea();
    }

    @PrePersist
    private void atribuirPeriodo() {
        int horaPartida = this.horarioPartida.getHour();
        if(horaPartida >= 6 && horaPartida <= 11) {
            this.periodo = Periodo.MANHA;
        } else if (horaPartida >= 12 && horaPartida <= 17) {
            this.periodo = Periodo.TARDE;
        } else {
            this.periodo = Periodo.NOITE;
        }
    }

}
