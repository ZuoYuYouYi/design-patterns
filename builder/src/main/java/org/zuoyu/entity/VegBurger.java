package org.zuoyu.entity;

/**
 * 素食汉堡.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-06-28 19:18
 **/
public class VegBurger extends BaseBurger {

  @Override
  public String name() {
    return "Veg Burger";
  }

  @Override
  public Double price() {
    return 25.0D;
  }
}
