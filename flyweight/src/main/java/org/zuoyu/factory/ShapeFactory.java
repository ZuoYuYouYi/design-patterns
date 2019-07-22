package org.zuoyu.factory;

import java.util.HashMap;
import lombok.extern.java.Log;
import org.zuoyu.entity.Circle;
import org.zuoyu.faucet.Shape;

/**
 * 图形工厂. 生成基于给定信息的实体类的对象
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-07-22 18:33
 **/
@Log
public class ShapeFactory {

  private static final HashMap<String, Shape> STRING_SHAPE_HASH_MAP = new HashMap<>();

  public static Shape getShape(String color) {
    Circle circle = (Circle) STRING_SHAPE_HASH_MAP.get(color);
    if (circle == null) {
      circle = new Circle();
      circle.setColor(color);
      STRING_SHAPE_HASH_MAP.put(color, circle);
      log.info("Creating circle of color : " + color);
    }
    return circle;
  }
}
