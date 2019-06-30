package org.zuoyu.factory;

import org.zuoyu.entity.Circle;
import org.zuoyu.entity.Rectangle;
import org.zuoyu.entity.Square;
import org.zuoyu.faucet.Color;
import org.zuoyu.faucet.Shape;

/**
 * 图形工厂.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-06-30 14:50
 **/
public class ShapeFactory extends AbstractFactory {


  @Override
  public Shape getShape(ShapeType shapeType) {
    if (shapeType == ShapeType.CIRCLE) {
      return new Circle();
    }
    if (shapeType == ShapeType.RECTANGLE) {
      return new Rectangle();
    }
    if (shapeType == ShapeType.SQUARE) {
      return new Square();
    }
    return null;
  }

  @Override
  public Color getColor(ColorType colorType) {
    return null;
  }
}
