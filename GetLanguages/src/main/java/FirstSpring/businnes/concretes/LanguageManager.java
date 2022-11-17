package FirstSpring.businnes.concretes;

import FirstSpring.businnes.abstracts.LanguageService;
import FirstSpring.dataAcces.abstracts.LanguageRepository;
import FirstSpring.entities.concretes.Language;
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
    public List<Language> deleteWithId(int id) {

            return languageRepository.deleteWithId(id);
    }

    @Override
    public void addLang(String name) {
        languageRepository.AddLang(name);
    }

    @Override
    public void update(int id,String name) {
        languageRepository.update(id,name);
    }

    @Override
    public String callWithId(int id) {
        return languageRepository.callWithId(id);
    }
}
