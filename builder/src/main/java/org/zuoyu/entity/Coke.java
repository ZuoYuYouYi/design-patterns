package org.zuoyu.entity;

/**
 * 可口可乐.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-06-28 19:25
 **/
public class Coke extends BaseColdDrink {

  @Override
  public String name() {
    return "Coke";
  }

  @Override
  public Double price() {
    return 30.0D;
  }
}
