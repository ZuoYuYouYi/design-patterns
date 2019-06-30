package org.zuoyu;

import org.zuoyu.factory.AbstractFactory;
import org.zuoyu.factory.AbstractFactory.ColorType;
import org.zuoyu.factory.AbstractFactory.ShapeType;
import org.zuoyu.factory.FactoryProducer;
import org.zuoyu.factory.FactoryProducer.FactoryType;
import org.zuoyu.faucet.Color;
import org.zuoyu.faucet.Shape;

/**
 * 使用 FactoryProducer 来获取 AbstractFactory，通过传递类型信息来获取实体类的对象
 *
 * @author zuoyu
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(FactoryType.SHAPE_FACTORY);
        if (shapeFactory != null) {
            Shape circle = shapeFactory.getShape(ShapeType.CIRCLE);
            circle.draw();
            Shape square = shapeFactory.getShape(ShapeType.SQUARE);
            square.draw();
            Shape rectangle = shapeFactory.getShape(ShapeType.RECTANGLE);
            rectangle.draw();
        }
        AbstractFactory colorFactory = FactoryProducer.getFactory(FactoryType.COLOR_FACTORY);
        if (colorFactory != null){
            Color red = colorFactory.getColor(ColorType.RED);
            red.fill();
            Color yellow = colorFactory.getColor(ColorType.YELLOW);
            yellow.fill();
            Color blue = colorFactory.getColor(ColorType.BLUE);
            blue.fill();
        }
    }
}
