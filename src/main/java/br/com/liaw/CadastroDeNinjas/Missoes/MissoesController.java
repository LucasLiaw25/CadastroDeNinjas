package br.com.liaw.CadastroDeNinjas.Missoes;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    private MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    @GetMapping("/listar")
    public List<MissoesModel> listMissoes(){
        return missoesService.listMission();
    }

    @GetMapping("/listar/{id}")
    public MissoesModel listMissoesId(@PathVariable Long id){
        return missoesService.listarModelId(id);
    }

    @PostMapping("/criar")
    public MissoesModel criarMissao(@RequestBody MissoesModel missoesModel){
        return missoesService.createMission(missoesModel);
    }

    @PutMapping("/alterar/{id}")
    public MissoesModel alterarMissao(@PathVariable Long id, @RequestBody MissoesModel missoesModel){
        return missoesService.updateMission(id, missoesModel) ;
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarMissao(@PathVariable Long id){
        missoesService.deleteMission(id);
    }

}
