package org.zuoyu.entity;

import lombok.extern.java.Log;
import org.zuoyu.faucet.Shape;

/**
 * 圆形.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-06-30 14:45
 **/
@Log
public class Circle implements Shape {

  @Override
  public void draw() {
    log.info("Drawing shape is circle");
  }
}
