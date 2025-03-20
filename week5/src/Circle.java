public class Circle {
    private point center;

    private int radius;
    public Circle(point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public point getCenter() {
        return center;
    }

    public void setCenter(point center) {
        this.center = center;
    }
}
