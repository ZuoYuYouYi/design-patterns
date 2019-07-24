package org.zuoyu.entity;

import lombok.AllArgsConstructor;
import org.zuoyu.faucet.Order;
import org.zuoyu.util.Stock;

/**
 * 抛售股票.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-07-24 18:05
 **/
@AllArgsConstructor
public class SellStock implements Order {

  private Stock stock;

  @Override
  public void execute() {
    this.stock.sell();
  }
}
