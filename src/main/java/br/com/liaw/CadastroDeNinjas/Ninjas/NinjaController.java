package br.com.liaw.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasVindas")
    public String boasVindsa(){
        return "Boas vindas à minha api";
    }

    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja criado";
    }

    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinja();
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
