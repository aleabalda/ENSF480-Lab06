package exA;

import java.awt.Graphics;
import java.awt.Color;

public class ColouredFrameDecorator extends Decorator {

    private int thickness;

    ColouredFrameDecorator(Component component, int x, int y, int width, int height, int thickness) {
        super(component, x, y, width, height);
        this.thickness = thickness;
    }

    @Override
    public void draw(Graphics g) {
        g.getColor();
        g.setColor(Color.RED);
        g.drawRect(x, y, thickness, height);
    }
}
