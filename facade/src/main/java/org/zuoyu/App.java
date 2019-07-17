package org.zuoyu;

import org.zuoyu.entity.ShapeMark;

/**
 * 使用该外观类画出各种类型的形状
 *
 * @author zuoyu
 */
public class App {

  public static void main(String[] args) {
    ShapeMark shapeMark = new ShapeMark();
    shapeMark.circleDraw();
    shapeMark.rectangleDraw();
    shapeMark.squareDraw();
  }
}
