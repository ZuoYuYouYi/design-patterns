package org.zuoyu.entity;

import lombok.extern.java.Log;

/**
 * 正方形.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-07-04 15:12
 **/
@Log
public class Square extends BaseShape {

  public Square() {
    shapeType = "Square";
  }

  @Override
  public void draw() {
    log.info(this.toString());
  }
}
