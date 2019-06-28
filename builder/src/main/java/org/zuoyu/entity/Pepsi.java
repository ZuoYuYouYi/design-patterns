package org.zuoyu.entity;

/**
 * 百事可乐.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-06-28 19:26
 **/
public class Pepsi extends BaseColdDrink{

  @Override
  public String name() {
    return "Pepsi";
  }

  @Override
  public Double price() {
    return 35.0D;
  }
}
