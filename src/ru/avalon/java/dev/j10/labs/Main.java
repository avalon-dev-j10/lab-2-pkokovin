package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.*;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = null;
        Shape circle1 = new Circle(new ShapePoint(0, 0), new ShapePoint(10, 10));
        Shape circle2 = new Circle(new ShapePoint(3,8), new ShapePoint(4,7));
        Shape circle3 = new Circle(new ShapePoint(1,3), new ShapePoint(12,5));
        Shape triangle1 = new Triangle(new ShapePoint(0, 0), new ShapePoint(0, 10), new ShapePoint(10, 0));
        Shape triangle2 = new Triangle(new ShapePoint(1,1), new ShapePoint(3,5), new ShapePoint(2,7));
        Shape triangle3 = new Triangle(new ShapePoint(-3,2), new ShapePoint(-1,-1), new ShapePoint(4,3));
        Shape rectangle1 = new Rectangle(new ShapePoint(0, 0), new ShapePoint(10,10));
        Shape rectangle2 = new Rectangle(new ShapePoint(-7,4), new ShapePoint(3,3));
        Shape rectangle3 = new Rectangle(new ShapePoint(2,4), new ShapePoint(7,6));
        Shape rectangle4 = new Rectangle(new ShapePoint(5,6), new ShapePoint(-4,-3));
        shapes = new Shape[]{circle1, circle2, circle3, triangle1, triangle2, triangle3, rectangle1, rectangle2, rectangle3, rectangle4};
        
        getMaxAreaSape(shapes);
        
       
        }
     public static void getMaxAreaSape(Shape[] shape){
            Shape biggestShape = shape[0];
            for (int i = 1; i < shape.length; i++) {
                if (biggestShape.getArea()<shape[i].getArea()){
                    biggestShape = shape[i];
                }
                
                } 
            System.out.println(biggestShape + " Area = " + biggestShape.getArea());
                
            }

        /*
         *  Выполнены действия над массивом 'shapes'
         *
         * 1. Проинициализированы переменную 'shapes' массивом
         *    содержащим 10 произвольных фигур. Массив должен
         *    содержать экземпляры классов Circle, Rectangle
         *    и Triangle.
         *
         * 2. Реализован поиск в массиве 'shapes' фигуры с максимальной
         *    площадью. Для поиска фигуры создан
         *    статический метод в текущем классе (Main).
         */
    }

