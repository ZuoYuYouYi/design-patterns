package org.zuoyu.bridge;

import org.zuoyu.entity.BaseShape;
import org.zuoyu.faucet.DrawApi;

/**
 * 圆形.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-07-04 22:29
 **/
public class Circle extends BaseShape {

  /**
   * 半径
   */
  private int radius;

  /**
   * 横坐标
   */
  private int x;

  /**
   * 竖坐标
   */
  private int y;

  public Circle(DrawApi drawApi, int radius, int x, int y) {
    super(drawApi);
    this.radius = radius;
    this.x = x;
    this.y = y;
  }

  @Override
  public void draw() {
    drawApi.drawCircle(this.radius, this.x, this.y);
  }
}
