package org.zuoyu;

import org.zuoyu.decorator.RedShapeDecorator;
import org.zuoyu.entity.Circle;
import org.zuoyu.faucet.Shape;

/**
 * 使用 RedShapeDecorator 来装饰 Shape 对象
 *
 * @author zuoyu
 */
public class App 
{
    public static void main( String[] args )
    {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();


    }
}
