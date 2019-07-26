package org.zuoyu.faucet;

/**
 * 集装箱.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-07-26 18:40
 **/
public interface Container<T> {

  /**
   * 获取迭代器
   * @return - 迭代器
   */
  Iterator<T> getIterator();

  /**
   * 添加元素
   * @param t - 元素
   */
  void add(T t);
}
