package br.com.liaw.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasVindas")
    public String boasVindsa(){
        return "Boas vindas à minha api";
    }

    @PostMapping("/create")
    public String criarNinja(){
        return "Ninja criado";
    }

    @GetMapping("/all")
    public String mostrarTodosNinjas(){
        return "Todos os ninjas";
    }

    @GetMapping("/allID")
    public String mostrarNinjaId(){
        return "Ninja por id";
    }

    @PutMapping("/updateAll")
    public String updatePutNinja(){
        return "Atualizar todo o ninja";
    }

    @DeleteMapping("/deletarId")
    public String deleteNinjaId(){
        return "Deletar ninja";
    }


}
