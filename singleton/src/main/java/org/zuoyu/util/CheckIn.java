package org.zuoyu.util;

import lombok.extern.java.Log;

/**
 * 登记式/静态内部类.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-06-30 20:32
 **/
@Log
public class CheckIn{

//  这种方式能达到双检锁方式一样的功效，但实现更简单。对静态域使用延迟初始化，应使用这种方式而不是双检锁方式。
//  这种方式只适用于静态域的情况，双检锁方式可在实例域需要延迟初始化时使用。

  private CheckIn(){}

  /**
   * 实例的持有者
   */
  private static class InstanceHolder{
    private static final CheckIn INSTANCE = new CheckIn();
  }

  /**
   * 获取CheckIn实例
   */
  public static CheckIn getInstance(){
    return InstanceHolder.INSTANCE;
  }

  /**
   * 显示该类的信息
   */
  public void showClassMessage() {
    log.info(this.toString());
  }

  /**
   * 返回该类的信息
   */
  public String writeClassMessage(){
    return this.toString();
  }
}
