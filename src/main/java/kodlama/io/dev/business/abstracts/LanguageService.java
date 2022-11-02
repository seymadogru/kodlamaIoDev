package kodlama.io.dev.business.abstracts;

import kodlama.io.dev.entities.concretes.Language;
import org.springframework.stereotype.Service;

import java.util.List;


public interface LanguageService {
    List<Language> getAll();
    void add(Language language) throws Exception;
    void delete(int id);
    void update(Language language);
    Language findById(int id);
}
