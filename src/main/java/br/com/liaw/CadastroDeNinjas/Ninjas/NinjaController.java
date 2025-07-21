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

    @PostMapping("/criar")
    public NinjaDTO criarNinja(@RequestBody NinjaDTO ninja){
        return ninjaService.criarNinja(ninja);
    }

    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas(){
        return ninjaService.listNinja();
    }

    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjaId(@PathVariable Long id){
        return ninjaService.listarNinjaId(id);
    }

    @PutMapping("/alterar")
    public NinjaModel updateNinja(@RequestBody NinjaModel ninja){
        return ninjaService.atualizarNinja(ninja);
    }

    @DeleteMapping("/deletar/{id}")
    public void deleteNinjaId(@PathVariable Long id){
        ninjaService.deletarNinja(id);
    }

}
