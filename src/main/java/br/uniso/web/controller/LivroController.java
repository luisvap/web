package br.uniso.web.controller;


import br.uniso.web.model.Livro;
import br.uniso.web.model.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
public class LivroController {


    @Autowired
    private LivroRepository repository;


    @GetMapping("/listar")
    public String listarLivros(Model model){

        List<Livro> listaLivros = repository.findAll();
        if(listaLivros != null){
            model.addAttribute("livros", listaLivros);
        }
        return "listagem";
    }


    @PostMapping("/salvar")
    public String adicionaLivro(Livro livro){
        repository.save(livro);
        return "redirect:/listar";
    }

}
