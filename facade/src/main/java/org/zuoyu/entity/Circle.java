package org.zuoyu.entity;

import lombok.extern.java.Log;
import org.zuoyu.faucet.Shape;

/**
 * 圆.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-07-17 16:16
 **/
@Log
public class Circle implements Shape {

  @Override
  public void draw() {
    log.info("Shape::draw()");
  }
}
