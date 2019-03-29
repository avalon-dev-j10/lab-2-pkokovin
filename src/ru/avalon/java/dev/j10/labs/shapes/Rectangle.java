package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Polygon{
    private final ShapePoint pointA;
    private final ShapePoint pointB;
    private final ShapePoint pointC;
    int rotate;

    public Rectangle(ShapePoint pointA, ShapePoint pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = new ShapePoint(pointB.getX() - pointA.getX(), pointA.getY());
        this.rotate = 0;
    }

    public Rectangle(ShapePoint pointA, ShapePoint pointB, int rotate) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = new ShapePoint(pointB.getX() - pointA.getX(), pointA.getY());
        this.rotate = rotate;
    }
    
    

    @Override
    public float getPerimeter() {
        float perimeter = (pointA.distanceTo(pointC)+pointB.distanceTo(pointC))*2;
        return perimeter;
    }

    @Override
    public float getArea() {
        float area = pointA.distanceTo(pointC)*pointB.distanceTo(pointC);
        return area;
    }

    @Override
    public int getRotation() {
        return rotate;
    }


    /*
     * Реализован класс 'Rectangle'
     * 1. Использовано наследование.
     * 2. Реализованы все абстрактные методы.
     */
    
}
