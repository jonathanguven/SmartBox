package smartbox;
import mvc.*;

public class Run extends Command {
    private Model model;
    private String component;

    public Run(Model model, Object source) {
        super(model);
        this.component = (String)source;
        this.model = model;
    }

    public void execute() {
        if (model instanceof Container) {
            try {
                ((Container) model).launch(component);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}