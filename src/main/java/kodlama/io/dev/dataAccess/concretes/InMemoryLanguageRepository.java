package kodlama.io.dev.dataAccess.concretes;

import kodlama.io.dev.dataAccess.abstracts.LanguageRepository;
import kodlama.io.dev.entities.concretes.Language;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

    List<Language> languages;

    public InMemoryLanguageRepository() {
        languages = new ArrayList<Language>();
        languages.add(new Language(1,"Java"));
        languages.add(new Language(2,"C Sharp"));

        languages.add(new Language(3,"C Sharp"));
    }

    @Override
    public List<Language> getAll() {
        return languages;
    }

    @Override
    public void add(Language language) {
        System.out.println("Dil eklendi");
    }

    @Override
    public void delete(int id) {
        System.out.println("Dil silindi");
    }

    @Override
    public void update(Language language) {
        System.out.println("Dil güncellendi");
    }

    @Override
    public Language findById(int id) {
        for (Language language : languages){
            if(language.getId() == id){
                return language;
            }
        }
        return null;
    }
}
