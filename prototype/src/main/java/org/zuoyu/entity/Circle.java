package org.zuoyu.entity;

import lombok.extern.java.Log;

/**
 * 圆形.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-07-04 15:14
 **/
@Log
public class Circle extends BaseShape {

  public Circle() {
    shapeType = "Circle";
  }

  @Override
  public void draw() {
    log.info(this.toString());
  }
}
