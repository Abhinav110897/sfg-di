package guru.springframework.sfgdi.services;


/**
 * Created by jt on 12/27/19.
 */
//@Profile("EN") Using config class instead
//@Service("i18nService") Using config class instead
public class I18nEnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
