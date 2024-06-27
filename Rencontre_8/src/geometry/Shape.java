package geometry;

class Shape {
    double x, y;

    public Shape() {
        x = 5;
        y = 5;
    }

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Position : (" + x + "," + y + ")";
    }
}
