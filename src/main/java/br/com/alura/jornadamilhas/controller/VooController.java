package br.com.alura.jornadamilhas.controller;

import br.com.alura.jornadamilhas.voo.DadosCadastroVoo;
import br.com.alura.jornadamilhas.voo.Voo;
import br.com.alura.jornadamilhas.voo.VooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("voos")
public class VooController {

    @Autowired
    private VooRepository repository;

    @GetMapping
    public List<Voo> listar(){
        return repository.findAll();
    }

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroVoo dados){
        System.out.println(dados);
    }
}
