package smartbox;
import mvc.*;

public class ContainerView extends View {

    private java.awt.List components;

    public ContainerView(Model model) {
        super(model);
        components = new java.awt.List(10);
        this.add(components);

    }

    @Override
    public void paintComponent(java.awt.Graphics gc) {
        super.paintComponent(gc);
        Container c = (Container) model;
        components.removeAll();
        for (String component : c.getComponentNames()) {
            components.add(component);
        }
    }
}