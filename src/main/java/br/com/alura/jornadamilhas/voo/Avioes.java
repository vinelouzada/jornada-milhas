package br.com.alura.jornadamilhas.voo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Avioes{

        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        private String nome;
        private Integer capacidadeEconomica;
        private Integer capacidadeExecutiva;
        private Integer capacidadePrimeiraClasse;
        private Integer CapacidadeTotal;

        @Enumerated(EnumType.STRING)
        private Companhias companhia;
}
