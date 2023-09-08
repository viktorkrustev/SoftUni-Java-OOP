package WorkingWithAbstractionLab.PointInRectangle_02;

public class Rectangle {
    private int bottomLeftX;
    private int bottomLeftY;
    private int topRightX;
    private int topRightY;

    public Rectangle(int bottomLeftX, int bottomLeftY, int topRightX, int topRightY) {
        this.bottomLeftX = bottomLeftX;
        this.bottomLeftY = bottomLeftY;
        this.topRightX = topRightX;
        this.topRightY = topRightY;
    }

    public boolean contains(Point point){
        if (point.getX()>=bottomLeftX && point.getX()<=topRightX && point.getY()>=bottomLeftY && point.getY()<=topRightY){
            return true;
        }
        return false;
    }

}
