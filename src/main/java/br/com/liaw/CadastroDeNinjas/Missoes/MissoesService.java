package br.com.liaw.CadastroDeNinjas.Missoes;

import br.com.liaw.CadastroDeNinjas.Ninjas.NinjaModel;
import br.com.liaw.CadastroDeNinjas.Ninjas.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissoesService {

    private MissoesRepository missoesRepository;

    public MissoesService(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }

    public List<MissoesModel> listMission(){
        return missoesRepository.findAll();
    }

    public MissoesModel listarModelId(Long id){
        Optional<MissoesModel> missoesModelOptional = missoesRepository.findById(id);
        return missoesModelOptional.orElse(null);
    }


    public MissoesModel createMission(MissoesModel missoesModel){
        return missoesRepository.save(missoesModel);
    }

    public MissoesModel updateMission(Long id, MissoesModel missoesModel){
        if (missoesRepository.existsById(id)){
            missoesModel.setId(id);
            return missoesRepository.save(missoesModel);
        }
        return null;
    }

    public void deleteMission(Long id){
        missoesRepository.deleteById(id);
    }

}
