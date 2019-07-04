package org.zuoyu;

import org.zuoyu.bridge.Circle;
import org.zuoyu.entity.BaseShape;
import org.zuoyu.entity.GreenCircle;
import org.zuoyu.entity.RedCircle;

/**
 * 使用 Shape 和 DrawAPI 类画出不同颜色的圆
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        BaseShape shapeRedCircle = new Circle(new RedCircle(), 10, 12, 12);
        shapeRedCircle.draw();

        BaseShape shapeGreenCircle = new Circle(new GreenCircle(), 5, 6, 6);
        shapeGreenCircle.draw();
    }
}
