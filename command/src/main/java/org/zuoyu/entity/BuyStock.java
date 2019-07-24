package org.zuoyu.entity;

import lombok.AllArgsConstructor;
import org.zuoyu.faucet.Order;
import org.zuoyu.util.Stock;

/**
 * 购买股票.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-07-24 18:03
 **/
@AllArgsConstructor
public class BuyStock implements Order {

  private Stock stock;

  @Override
  public void execute() {
    this.stock.buy();
  }
}
