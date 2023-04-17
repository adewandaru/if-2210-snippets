public interface Shape {
    double getArea();
    double getPerimeter();
}

interface Rectangular extends Shape {
    double getWidth();
    double getHeight();
}

interface Circular extends Shape {
    double getRadius();
}

