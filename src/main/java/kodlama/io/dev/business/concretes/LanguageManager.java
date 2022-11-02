package kodlama.io.dev.business.concretes;

import kodlama.io.dev.business.abstracts.LanguageService;
import kodlama.io.dev.dataAccess.abstracts.LanguageRepository;
import kodlama.io.dev.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LanguageManager implements LanguageService {

    private LanguageRepository languageRepository;



    @Autowired
    public LanguageManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public List<Language> getAll() {
        return languageRepository.getAll();
    }

    @Override
    public void add(Language language) throws Exception{
        if (language.getName().isEmpty()){
           throw new Exception("İsim boş geçilemez");
        }
        for (Language language1 : languageRepository.getAll()){
            if(language1.getName().equals(language.getName())){
                throw new Exception("Aynı isimde bir kurs giremezsiniz.");
            }
        }
        languageRepository.add(language);
    }

    @Override
    public void delete(int id) {
        languageRepository.delete(id);
    }

    @Override
    public void update(Language language) {
        languageRepository.update(language);
    }

    @Override
    public Language findById(int id) {
       return languageRepository.findById(id);
    }
}
