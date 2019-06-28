package org.zuoyu.entity;

import org.zuoyu.faucet.Item;

/**
 * 汉堡类.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-06-28 17:32
 **/
public abstract class BaseBurger implements Item {


  @Override
  public Packing packing() {
    return Packing.WRAPPER;
  }

}
