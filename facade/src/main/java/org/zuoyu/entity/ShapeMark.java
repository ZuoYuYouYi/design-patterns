package org.zuoyu.entity;

import org.zuoyu.faucet.Shape;

/**
 * 对外提供功能.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-07-17 16:18
 **/
public class ShapeMark {

  private Shape circle;
  private Shape rectangle;
  private Shape square;

  public ShapeMark() {
    this.circle = new Circle();
    this.rectangle = new Rectangle();
    this.square = new Square();
  }

  public void circleDraw() {
    this.circle.draw();
  }

  public void rectangleDraw() {
    this.rectangle.draw();
  }

  public void squareDraw() {
    this.square.draw();
  }
}
