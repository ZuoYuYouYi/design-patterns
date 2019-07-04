package org.zuoyu.entity;

import lombok.Data;
import lombok.extern.java.Log;

/**
 * 抽象形状.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-07-04 15:02
 **/
@Log
@Data
public abstract class BaseShape implements Cloneable{

  public enum ShapeId{
    /**
     * 长方形
     */
    RECTANGLE,

    /**
     * 正方形
     */
    SQUARE,

    /**
     * 圆形
     */
    CIRCLE
  }

  private ShapeId shapeId;

  String shapeType;

  /**
   * 绘画
   */
  public abstract void draw();

  @Override
  public Object clone() throws CloneNotSupportedException {
    Object object = null;
    try {
      object = super.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return object;
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
