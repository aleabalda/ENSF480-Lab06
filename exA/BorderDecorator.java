package exA;

import java.awt.Graphics;

public class BorderDecorator extends Decorator {

    BorderDecorator(Component component, int x, int y, int width, int height) {
        super(component, x, y, width, height);
    }

    @Override
    public void draw(Graphics g) {
        g.drawRect(x, y, width, height);
    }
}
