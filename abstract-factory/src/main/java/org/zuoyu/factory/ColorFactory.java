package org.zuoyu.factory;

import org.zuoyu.entity.Blue;
import org.zuoyu.entity.Red;
import org.zuoyu.entity.Yellow;
import org.zuoyu.faucet.Color;
import org.zuoyu.faucet.Shape;

/**
 * 颜色工厂.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-06-30 16:30
 **/
public class ColorFactory extends AbstractFactory {

  @Override
  public Shape getShape(ShapeType shapeType) {
    return null;
  }

  @Override
  public Color getColor(ColorType colorType) {
    if (colorType == ColorType.RED){
      return new Red();
    }
    if (colorType == ColorType.YELLOW){
      return new Yellow();
    }
    if (colorType == ColorType.BLUE){
      return new Blue();
    }
    return null;
  }
}
