package org.zuoyu.decorator;

import org.zuoyu.faucet.Shape;

/**
 * 抽象装饰类.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-07-16 13:52
 **/
public abstract class BaseShapeDecorator implements Shape {

  protected Shape shape;

  public BaseShapeDecorator(Shape shape) {
    this.shape = shape;
  }

  @Override
  public void draw() {
    shape.draw();
  }
}
