package org.zuoyu.util;

import java.util.Hashtable;
import org.zuoyu.entity.BaseShape;
import org.zuoyu.entity.BaseShape.ShapeId;
import org.zuoyu.entity.Circle;
import org.zuoyu.entity.Rectangle;
import org.zuoyu.entity.Square;

/**
 * 图形对象缓存.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-07-04 15:23
 **/
public class ShapeCache {

  /**
   * Hashtable相对与HashMap而言，线程是安全的
   */
  private static Hashtable<ShapeId, BaseShape> shapeHashtable = new Hashtable<>();

  /**
   * 获取缓存对象
   * @param shapeId - 形状编号
   * @return - 图形对象
   * @throws CloneNotSupportedException - 无法克隆的异常
   */
  public static BaseShape getShape(ShapeId shapeId) throws CloneNotSupportedException {
    BaseShape shape = shapeHashtable.get(shapeId);
    return (BaseShape) shape.clone();
  }

  public static void loadCache(){
    Circle circle = new Circle();
    circle.setShapeId(ShapeId.CIRCLE);
    shapeHashtable.put(circle.getShapeId(), circle);

    Rectangle rectangle = new Rectangle();
    rectangle.setShapeId(ShapeId.RECTANGLE);
    shapeHashtable.put(rectangle.getShapeId(), rectangle);

    Square square = new Square();
    square.setShapeId(ShapeId.SQUARE);
    shapeHashtable.put(square.getShapeId(), square);
  }
}
