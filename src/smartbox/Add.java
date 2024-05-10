package smartbox;
import mvc.*;

import javax.swing.*;

public class Add extends Command {
    private Model model;
    private String component;

    public Add(Model model, Object source) {
        super(model);
        this.component = (String) source;
        this.model = model;
    }

    public void execute() {
        if (model instanceof Container) {
            try {
                ((Container) model).addComponent(component);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Component not found. Components are case sensitive.");
                e.printStackTrace();
            }
        }
    }
}