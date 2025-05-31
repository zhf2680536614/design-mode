package com.atey.design_mode.basic_son_change;

/**
 * 里氏代换原则
 *  任何基类可以出现的地方，子类一定可以出现
 *  子类可以扩展父类的功能，但不能改变父类原有的功能
 *  如果需要重写父类的方法，可以在父类中定义抽象方法
 */

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(10);
        resize(rectangle);
        printLengthAndWidth(rectangle);
    }

    public static void resize(Rectangle rectangle){
        while(rectangle.getWidth()<=rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    public static void printLengthAndWidth(Quadrilateral quadrilateral){
        System.out.println(quadrilateral.getLength());
        System.out.println(quadrilateral.getWidth());
    }
}
