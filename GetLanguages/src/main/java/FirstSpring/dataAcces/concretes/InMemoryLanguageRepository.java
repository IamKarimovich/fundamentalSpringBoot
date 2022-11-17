package FirstSpring.dataAcces.concretes;

import FirstSpring.dataAcces.abstracts.LanguageRepository;
import FirstSpring.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

    private List<Language> languages;
    private Language language;
    @Autowired
    public InMemoryLanguageRepository(List<Language> languages) {
        this.languages = languages;
        languages.add(new Language(1,"Java"));
        languages.add(new Language(2,"C++"));
        languages.add(new Language(3,"Python"));
        languages.add(new Language(4,"C#"));

    }

    @Override
    public List<Language> getAll() {
        return languages;
    }

    @Override
    public List<Language> deleteWithId(int id) {
        return (List<Language>) languages.remove(id);
    }

    @Override
    public void AddLang(String name) {
        languages.add(new Language(languages.size()+1,name));
    }

    @Override
    public void update(int id,String name) {

        languages.set((id-1),new Language(id,name));
    }
    @Override
    public String callWithId(int id){

        return languages.get(id - 1).getName();
    }
}
