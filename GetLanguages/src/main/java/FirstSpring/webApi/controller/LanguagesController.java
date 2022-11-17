package FirstSpring.webApi.controller;

import FirstSpring.businnes.abstracts.LanguageService;
import FirstSpring.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Scanner;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
    Scanner scanner = new Scanner(System.in);
    private LanguageService languageService;

    @Autowired
    public LanguagesController(LanguageService languageService) {
        this.languageService = languageService;
    }
    @GetMapping("/getAll")
    List<Language> getAll()
    {
        return languageService.getAll();
    }
    @GetMapping("/delete")
    List<Language> deleteLang()
    {
        int id = scanner.nextInt();
        int realId = id-1;
        return languageService.deleteWithId(realId);
    }
    @GetMapping("/add")
    void addLang(String name){
        name = scanner.nextLine();
        languageService.addLang(name);
    }
    @GetMapping("/update")
    void update()
    {
        System.out.println("id: ");
        int id = scanner.nextInt();
        System.out.println("name:  ");
        String name = scanner.nextLine();
        languageService.update(id,name);
    }
    @GetMapping("/call")
    String callWithId(){
        System.out.println("id: ");
        int id=scanner.nextInt();
        return languageService.callWithId(id);
    }


}
