package org.zuoyu.util;

import lombok.extern.java.Log;

/**
 * 饿汉式.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-06-30 20:19
 **/
@Log
public class HungryBones {

//  这种方式比较常用，但容易产生垃圾对象。
//  它基于 classloder 机制避免了多线程的同步问题，
//  不过，instance 在类装载时就实例化，虽然导致类装载的原因有很多种，
//  在单例模式中大多数都是调用 getInstance 方法，但是也不能确定有其他的方式（或者其他的静态方法）导致类装载，
//  这时候初始化 instance 显然没有达到 lazy loading 的效果。

  private HungryBones(){}

  private static HungryBones instance = new HungryBones();

  /**
   * 获取HungryBones的实例
   */
  public static HungryBones getInstance(){
    return instance;
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
  public String writeClassMessage() {
    return this.toString();
  }
}
