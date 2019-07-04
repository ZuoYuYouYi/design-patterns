package org.zuoyu.entity;

import lombok.extern.java.Log;

/**
 * 长方形.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-07-04 15:10
 **/
@Log
public class Rectangle extends BaseShape {

  public Rectangle() {
    shapeType = "Rectangle";
  }

  @Override
  public void draw() {
    log.info(this.toString());
  }
}
