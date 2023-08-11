package br.com.alura.jornadamilhas.controller;

import br.com.alura.jornadamilhas.voo.DadosCadastroVooDto;
import br.com.alura.jornadamilhas.voo.Voo;
import br.com.alura.jornadamilhas.voo.VooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/voos")
public class VooController {

    @Autowired
    private VooRepository repository;

    @GetMapping
    public List<Voo> listar(){
        return repository.findAll();
    }
    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroVooDto dados){
        repository.save(new Voo(dados));
    }

    @GetMapping("/buscar")
    public void buscar(
            @RequestParam String origem,
            @RequestParam String destino,
            @RequestParam LocalDateTime horarioPartida,
            @RequestParam LocalDateTime horarioChegada,
            @RequestParam Integer quantidadeConxecoes
    ){
        //buscar atraves dos parametros
        System.out.println(horarioPartida);
    }
}
