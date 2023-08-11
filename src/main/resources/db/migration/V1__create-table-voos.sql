CREATE table voos(
                     id INT NOT NULL AUTO_INCREMENT,
                     numero_voo INT UNSIGNED NOT NULL,
                     origem VARCHAR(100) NOT NULL,
                     destino VARCHAR(100) NOT NULL,
                     horario_partida TIMESTAMP NOT NULL,
                     horario_chegada TIMESTAMP NOT NULL,
                     quantidade_conexoes INT NOT NULL,
                     PRIMARY KEY (`id`)
)