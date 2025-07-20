package br.com.liaw.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @GetMapping("/boasVindas")
    public String boasVindsa(){
        return "Boas vindas à minha api";
    }

    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja criado";
    }

    @GetMapping("/listar")
    public String mostrarTodosNinjas(){
        return "Todos os ninjas";
    }

    @GetMapping("/allID")
    public String mostrarNinjaId(){
        return "Ninja por id";
    }

    @PutMapping("/alterar")
    public String updatePutNinja(){
        return "Atualizar todo o ninja";
    }

    @DeleteMapping("/deletar")
    public String deleteNinjaId(){
        return "Deletar ninja";
    }


}
