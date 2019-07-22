package org.zuoyu.entity;

import lombok.Data;
import lombok.extern.java.Log;
import org.zuoyu.faucet.Shape;

/**
 * 圆.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-07-22 18:28
 **/
@Data
@Log
public class Circle implements Shape {

  private String color;

  private int x;

  private int y;

  private int radius;

  @Override
  public void draw() {
    log.info("Circle: draw()\t" + this.toString());
  }
}
