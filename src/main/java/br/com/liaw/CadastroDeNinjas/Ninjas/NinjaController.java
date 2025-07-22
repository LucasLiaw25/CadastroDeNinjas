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
        return ninjaService.createNinja(ninja);
    }

    @GetMapping("/listar")
    public List<NinjaDTO> listarNinjas(){
        return ninjaService.listNinja();
    }

    @GetMapping("/listar/{id}")
    public NinjaDTO listarNinjaId(@PathVariable Long id){
        return ninjaService.listNinjaId(id);
    }

    @PutMapping("/alterar/{id}")
    public NinjaDTO updateNinja(@PathVariable Long id, @RequestBody NinjaDTO ninja){
        return ninjaService.atualizarNinja(ninja, id);
    }

    @DeleteMapping("/deletar/{id}")
    public void deleteNinjaId(@PathVariable Long id){
        ninjaService.deletarNinja(id);
    }

}
