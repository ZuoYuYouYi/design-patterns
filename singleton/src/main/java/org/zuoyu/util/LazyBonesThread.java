package org.zuoyu.util;

import lombok.extern.java.Log;

/**
 * 懒汉式，线程安全.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-06-30 20:13
 **/
@Log
public class LazyBonesThread {

//  这种方式具备很好的 lazy loading，能够在多线程中很好的工作，
//  但是，效率很低，99% 情况下不需要同步。

  private LazyBonesThread() {
  }

  private static LazyBonesThread instance;

  /**
   * 获取LazybonesThread的实例
   */
  public synchronized static LazyBonesThread getInstance() {
    if (instance == null) {
      instance = new LazyBonesThread();
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
