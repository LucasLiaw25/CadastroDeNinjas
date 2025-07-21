package br.com.liaw.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;
    private NinjaMapper ninjaMapper;

    public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
    }

    public List<NinjaModel> listNinja(){
        return ninjaRepository.findAll();
    }

    public NinjaModel listarNinjaId(Long id){
        Optional<NinjaModel> ninjaPorId = ninjaRepository.findById(id);
        return ninjaPorId.orElse(null);
    }

    public NinjaDTO criarNinja(NinjaDTO ninjaDTO){
        NinjaModel ninjaModel = ninjaMapper.map(ninjaDTO);
        NinjaModel ninja = ninjaRepository.save(ninjaModel);
        return ninjaMapper.map(ninja);
    }

    public NinjaModel atualizarNinja(NinjaModel ninja){
        return ninjaRepository.save(ninja);
    }

    public void deletarNinja(Long id){
        ninjaRepository.deleteById(id);
    }



}
