package org.zuoyu.decorator;

import org.zuoyu.faucet.Shape;

/**
 * 红色的实体装饰类.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-07-16 13:55
 **/
public class RedShapeDecorator extends BaseShapeDecorator {

  public RedShapeDecorator(Shape shape) {
    super(shape);
  }

  @Override
  public void draw() {
    shape.draw();
    setRedBorder(shape);
  }

  private void setRedBorder(Shape shape){
    System.out.println("Border Color: Red");
  }
}
