package FirstSpring.dataAcces.abstracts;

import FirstSpring.entities.concretes.Language;

import java.util.List;

public interface LanguageRepository {
    List<Language> getAll();
    List<Language> deleteWithId(int id);
    void AddLang(String name);
    void update(int id,String name);
    String callWithId(int id);

}
