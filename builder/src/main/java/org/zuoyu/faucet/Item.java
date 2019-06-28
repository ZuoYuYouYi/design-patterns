package org.zuoyu.faucet;

/**
 * 表示食物条目的接口.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-06-28 17:22
 **/
public interface Item {

  enum Packing{
    /**
     * 包装纸
     */
    WRAPPER,
    /**
     * 瓶子
     */
    BOTTLE
  }

  /**
   * 食物的名称
   * @return - name
   */
  String name();

  /**
   * 食物的包装
   * @return - packing
   */
  Packing packing();

  /**
   * 食物的价格
   * @return - price
   */
  Double price();
}
