import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("controller")
@RequestScoped
public class MainController {

    public String renderDestination() {
        return "destination?faces-redirect=true";
    }
}
