package org.zuoyu.entity;

import lombok.extern.java.Log;
import org.zuoyu.faucet.Shape;

/**
 * 正方形.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-07-17 16:15
 **/
@Log
public class Square implements Shape {

  @Override
  public void draw() {
    log.info("Square::draw()");
  }
}
