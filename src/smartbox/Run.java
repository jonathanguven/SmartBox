package smartbox;
import mvc.*;

public class Run extends Command {
    private Model model;
    private Component component;

    public Run(Model model, Object source) {
        super(model);
        this.component = (Component)source;
        this.model = model;
    }

    public void execute() {
        if (model instanceof Container) {
            try {
                ((Container) model).launch(component.name);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}