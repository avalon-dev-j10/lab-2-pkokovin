package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */
public class Circle implements Ellipse{
    private final ShapePoint center;
    private final ShapePoint circlePoint;
    private final float radius;
    

//    public Circle(ShapePoint center, ShapePoint circlePoint) {
//        this.center = center;
//        this.circlePoint = circlePoint;
//        this.radius = center.distanceTo(circlePoint);
//    }

    public Circle(ShapePoint center, ShapePoint circlePoint) {
        this.center = center;
        this.circlePoint = circlePoint;
        this.radius = center.distanceTo(circlePoint);
    }
    
    
    

    @Override
    public float getLength() {
        double length = this.radius*2*Math.PI;
        return (float)length;
    }

    @Override
    public float getArea() {
        double area = this.radius*this.radius*Math.PI;
        return (float)area;
    }


    /*
     * Реализован класс 'Circle'
     * 1. Использовано наследование.
     * 2. Реализованы все абстрактные методы.
     */
    
}
