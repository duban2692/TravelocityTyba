package co.com.travelocity.util;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import java.util.ResourceBundle;

public class Utilities {

    private static final Logger LOGGER = LoggerFactory.getLogger(Utilities.class);

    public static final ResourceBundle SERENITY = ResourceBundle.getBundle("environment");

    public static String getEnvironments() {

        return SERENITY.getString("environment");
    }

    public static String getRandomDriver() {
        String[] drivers = {"chrome", "firefox", "edge"};
        int r = (int) Math.floor(Math.random() * drivers.length);
        return drivers[r];
    }

    public static WebElementFacade randomElement(Actor actor, Target target) {
        List<WebElementFacade> listElements = target.resolveAllFor(actor);
        int elementPosition = (int) (Math.random() * listElements.size());
        return listElements.get(elementPosition);
    }
}
