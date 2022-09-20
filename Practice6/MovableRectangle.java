package Practice6;

public class MovableRectangle extends MovablePoint implements Movable
{

    private final MovablePoint topLeft;
    private final MovablePoint bottomRight;

    public MovableRectangle(int x, int y, int xSpeed, int ySpeed, int x2, int y2, int xSpeed2, int ySpeed2) {
        topLeft = new MovablePoint(x, y, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    @Override
    public String toString(){return "MovablePoint{"+"x= "+"}";}

}
