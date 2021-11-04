package guru.springframework.sfgdi.services;

/**
 * Created by jt on 12/27/19.
 */
//@Profile({"ES", "default"}) Using config class instead
//@Service("i18nService") Using config class instead
public class I18NSpanishService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
