package org.zuoyu.entity;

/**
 * 鸡肉汉堡.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-06-28 19:20
 **/
public class ChickenBurger extends BaseBurger {

  @Override
  public String name() {
    return "Chicken Burger";
  }

  @Override
  public Double price() {
    return 50.5D;
  }
}
