package org.zuoyu.entity;

import org.zuoyu.faucet.Item;

/**
 * 冷饮类.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-06-28 17:36
 **/
public abstract class BaseColdDrink implements Item {

  @Override
  public Packing packing() {
    return Packing.BOTTLE;
  }
}
