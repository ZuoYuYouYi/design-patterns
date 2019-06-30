package org.zuoyu.factory;

import org.zuoyu.entity.Circle;
import org.zuoyu.entity.Rectangle;
import org.zuoyu.entity.Square;
import org.zuoyu.faucet.Shape;

/**
 * 图形工厂.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-06-30 14:50
 **/
public class ShapeFactory {

  public enum ShapeType{
    /**
     * 圆形
     */
    CIRCLE,
    /**
     * 长方形
     */
    RECTANGLE,
    /**
     * 正方形
     */
    SQUARE
  }

  /**
   * 获取图形
   * @param shapeType - 图形的类型
   * @return - 指定的图形
   */
  public Shape getShape(ShapeType shapeType){
    if (shapeType == ShapeType.CIRCLE){
      return new Circle();
    }
    if (shapeType == ShapeType.RECTANGLE){
      return new Rectangle();
    }
    if (shapeType == ShapeType.SQUARE){
      return new Square();
    }
    return null;
  }
}
