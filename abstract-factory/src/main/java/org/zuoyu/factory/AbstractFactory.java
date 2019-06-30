package org.zuoyu.factory;

import org.zuoyu.faucet.Color;
import org.zuoyu.faucet.Shape;

/**
 * 抽象工厂.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-06-30 16:23
 **/
public abstract class AbstractFactory {

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
 public abstract Shape getShape(ShapeType shapeType);

 public enum ColorType{
   /**
    * 红色
    */
   RED,
   /**
    * 黄色
    */
   YELLOW,
   /**
    * 蓝色
    */
   BLUE
 }

  /**
   * 获取颜色
   * @param colorType - 颜色类型
   * @return 颜色
   */
 public abstract Color getColor(ColorType colorType);
}
