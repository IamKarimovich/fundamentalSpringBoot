package FirstSpring.businnes.abstracts;

import FirstSpring.entities.concretes.Language;
import org.springframework.stereotype.Service;

import java.util.List;


public interface LanguageService {
    List<Language> getAll();
    List<Language> deleteWithId(int id);

    void addLang(String name);
    void update(int id,String name);
    String callWithId(int id);
}
