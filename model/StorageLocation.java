package sokoban.model;


import java.awt.*;

public class StorageLocation extends GameObject {
    private static final int SIZE = 2;

    public StorageLocation(int x, int y) {
        super(x, y, SIZE, SIZE);
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(Color.RED);

        int xc = getX();
        int yc = getY();
        int height = getHeight();
        int width = getWidth();

        graphics.drawOval(xc - width/2, yc - height/2, width, height);
    }
}
