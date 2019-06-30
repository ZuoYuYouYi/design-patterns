package org.zuoyu.entity;

import lombok.extern.java.Log;
import org.zuoyu.faucet.Shape;

/**
 * 长方形.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-06-30 14:47
 **/
@Log
public class Rectangle implements Shape {

  @Override
  public void draw() {
    log.info("Drawing shape is rectangle");
  }
}
