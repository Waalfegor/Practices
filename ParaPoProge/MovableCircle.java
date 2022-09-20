package ParaPoProge;

public class MovableCircle extends MovablePoint implements Movable
{
    private int radius;
    MovablePoint center;

    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public String  toString(){return "MovableCircle{"+"radius= "+radius+", center= "+center;}

}
