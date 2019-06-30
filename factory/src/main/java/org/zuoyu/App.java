package org.zuoyu;

import org.zuoyu.factory.ShapeFactory;
import org.zuoyu.factory.ShapeFactory.ShapeType;
import org.zuoyu.faucet.Shape;

/**
 * 使用该工厂，通过传递类型信息来获取实体类的对象
 *
 * @author zuoyu
 */
public class App 
{
    public static void main( String[] args )
    {
        ShapeFactory shapeFactory = new ShapeFactory();
//        获取正方形
        Shape square = shapeFactory.getShape(ShapeType.SQUARE);
        square.draw();
//        获取长方形
        Shape rectangle = shapeFactory.getShape(ShapeType.RECTANGLE);
        rectangle.draw();
//        获取圆形
        Shape circle = shapeFactory.getShape(ShapeType.CIRCLE);
        circle.draw();
    }
}
