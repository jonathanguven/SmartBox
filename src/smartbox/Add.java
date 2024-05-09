package smartbox;
import mvc.*;

public class Add extends Command {
    private Model model;
    private Component component;

    public Add(Model model, Object source) {
        super(model);
        this.component = (Component)source;
    }

    public void execute() {
        if (model instanceof Container) {
            try {
                ((Container) model).addComponent(component.name);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}