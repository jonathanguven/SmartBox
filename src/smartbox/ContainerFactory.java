package smartbox;
import mvc.*;

public class ContainerFactory implements AppFactory {
    public Model makeModel() {
        return new Container();
    }

    public View makeView(Model m) {
        return new ContainerView(m);
    }

    public String[] getEditCommands() {
        return new String[] {"Add", "Rem", "Run"};
    }

    public Command makeEditCommand(Model model, String type, Object source) {
        switch (type) {
            case "Add":
                return new Add(model, source);
            case "Rem":
                return new Remove(model, source);
            case "Run":
                return new Run(model, source);
        }
        return null;
    }

    public String getTitle() {
        return "SmartBox";
    }

    public String[] getHelp() {
        return new String[] {"Container", "Add a component", "Remove a component", "Run a component"};
    }

    public String about() {
        return "SmartBox version 1.0\nAuthor: Jonathan Nguyen";
    }
}