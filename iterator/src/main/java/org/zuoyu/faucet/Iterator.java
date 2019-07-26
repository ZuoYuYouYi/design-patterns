package org.zuoyu.faucet;

/**
 * 迭代器接口.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-07-26 18:38
 **/
public interface Iterator<T> {

  /**
   * 是否还有下一个
   * @return -
   */
  boolean hasNext();

  /**
   * 获取下一个元素
   * @return -
   */
  T next();
}
