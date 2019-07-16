package org.zuoyu.entity;

import org.zuoyu.faucet.Shape;

/**
 * 圆形.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-07-16 13:50
 **/
public class Circle implements Shape {

  @Override
  public void draw() {
    System.out.println("Shape: Circle");
  }
}
