package kodlama.io.dev.dataAccess.abstracts;

import kodlama.io.dev.entities.concretes.Language;

import java.util.List;

public interface LanguageRepository {
    List<Language> getAll();
    void add(Language language);
    void delete(int id);
    void update(Language language);
    Language findById(int id);
}
