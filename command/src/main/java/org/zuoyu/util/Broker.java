package org.zuoyu.util;

import java.util.ArrayList;
import java.util.List;
import org.zuoyu.faucet.Order;

/**
 * 经纪人（命令的调用类）.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-07-24 18:06
 **/
public class Broker {

  private List<Order> orders = new ArrayList<>();

  /**
   * 添加命令
   * @param order - 命令
   */
  public void setOrders(Order order){
    orders.add(order);
  }

  /**
   * 执行命令
   */
  public void executeOrders(){
    orders.forEach(Order::execute);
    orders.clear();
  }
}
