package org.zuoyu;

import java.util.Random;
import org.zuoyu.entity.Circle;
import org.zuoyu.factory.ShapeFactory;

/**
 * 通过传递颜色信息来获取实体类的对象
 *
 * @author zuoyu
 */
public class App {

  private static final String[] COLORS = {"Red", "Green", "Blue", "White", "Black"};

  public static void main(String[] args) {
    int num = 20;
    for (int i = 0; i < num; i++) {
      Circle circle = (Circle) ShapeFactory.getShape(COLORS[(int) (Math.random() * COLORS.length)]);
      circle.setX(new Random().nextInt());
      circle.setY(new Random().nextInt());
      circle.setRadius(100);
      circle.draw();
    }
  }
}
