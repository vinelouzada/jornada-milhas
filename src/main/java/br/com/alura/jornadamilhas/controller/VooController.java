package br.com.alura.jornadamilhas.controller;

import br.com.alura.jornadamilhas.voo.DadosCadastroVooDto;
import br.com.alura.jornadamilhas.voo.FiltroPesquisaDto;
import br.com.alura.jornadamilhas.voo.Voo;
import br.com.alura.jornadamilhas.voo.VooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/voos")
public class VooController {

    @Autowired
    private VooRepository repository;

    @GetMapping
    public List<Voo> listar(FiltroPesquisaDto dto) {
        System.out.println(dto);
        return repository.findAllByParams(dto.origem(),
                dto.destino(),
                dto.precoMinimo(),
                dto.precoMaximo(),
                dto.horarioPartida(),
                dto.horarioChegada(),
                dto.periodo(),
                dto.quantidadeConexoes(),
                dto.companhia());
    }

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroVooDto dados){
        repository.save(new Voo(dados));
    }

}
