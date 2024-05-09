package smartbox;
import mvc.*;

public class Remove extends Command{
    private Model model;
    private Component component;

    public Remove(Model model, Object source) {
        super(model);
        this.component = (Component)source;
        this.model = model;
    }

    public void execute() {
        if (model instanceof Container) {
            try {
                ((Container) model).remComponent(component.name);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}