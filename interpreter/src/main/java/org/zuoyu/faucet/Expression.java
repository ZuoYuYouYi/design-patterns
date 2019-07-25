package org.zuoyu.faucet;

/**
 * 表达式接口.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-07-25 18:32
 **/
public interface Expression {

  /**
   * 解释
   * @param context - 内容
   * @return -
   */
  boolean interpret(String context);
}
