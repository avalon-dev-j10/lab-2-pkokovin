package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая
 * фигура, образованная тремя отрезками, которые соединяют
 * три точки, не лежащие на одной прямой. Указанные три
 * точки называются вершинами треугольника, а отрезки —
 * сторонами треугольника. Часть плоскости, ограниченная
 * сторонами, называется внутренностью треугольника: нередко
 * треугольник рассматривается вместе со своей внутренностью
 * (например, для определения понятия площади).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */
public class Triangle implements Polygon{
    private final ShapePoint topA;
    private final ShapePoint topB;
    private final ShapePoint topC;
    private final int rotate;

    public Triangle(ShapePoint topA, ShapePoint topB, ShapePoint topC, int rotate) {
        this.topA = topA;
        this.topB = topB;
        this.topC = topC;
        this.rotate = rotate;
    }

    public Triangle(ShapePoint topA, ShapePoint topB, ShapePoint topC) {
        this.topA = topA;
        this.topB = topB;
        this.topC = topC;
        this.rotate = 0;
    }
    
    
    
    
    @Override
    public float getPerimeter() {
        float perimeter = topA.distanceTo(topB) + topB.distanceTo(topC) + topC.distanceTo(topA);
        return perimeter;
    }

    @Override
    public float getArea() {
        float halfPerimetr = this.getPerimeter()/2;
        double area = Math.sqrt(halfPerimetr*(halfPerimetr-topA.distanceTo(topB))*(halfPerimetr-topB.distanceTo(topC))*(halfPerimetr-topC.distanceTo(topA)));
        return (float)area;
    }

    @Override
    public int getRotation() {
        return rotate;
    }


    /*
     * Реализован класс 'Triangle'
     * 1. Использовано наследование.
     * 2. Реализованы все абстрактные методы.
     */
    
}
