package smartbox;
import mvc.*;

public class Add extends Command {
    private Model model;
    private String component;

    public Add(Model model, Object source) {
        super(model);
        this.component = (String)source;
    }

    public void execute() {
        if (model instanceof Container) {
            try {
                ((Container) model).addComponent(component);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}