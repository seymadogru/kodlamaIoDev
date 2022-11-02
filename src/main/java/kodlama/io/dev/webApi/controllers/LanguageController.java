package kodlama.io.dev.webApi.controllers;

import kodlama.io.dev.business.abstracts.LanguageService;
import kodlama.io.dev.entities.concretes.Language;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LanguageController {
    private LanguageService languageService;

    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }
    @GetMapping("/getAll")
    public List<Language> getAll(){
        return languageService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody Language language) throws Exception{
        languageService.add(language);
    }

    @GetMapping("/findById/{id}")
    public Language getById(int id){
        return languageService.findById(id);
    }

    @PutMapping("/update")
    public void update(Language language){
        languageService.update(language);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(int id){
        languageService.delete(id);
    }


}
