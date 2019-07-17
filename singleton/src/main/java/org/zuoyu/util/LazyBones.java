package org.zuoyu.util;

import lombok.extern.java.Log;

/**
 * 懒汉式，线程不安全.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-06-30 20:08
 **/
@Log
public class LazyBones {

//  这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。
//  因为没有加锁 synchronized，所以严格意义上它并不算单例模式。

  private LazyBones() {
  }

  private static LazyBones instance;

  /**
   * 获取Lazybones的实例
   */
  public static LazyBones getInstance() {
    if (instance == null) {
      instance = new LazyBones();
    }
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
