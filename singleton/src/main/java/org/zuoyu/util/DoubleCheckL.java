package org.zuoyu.util;

import lombok.extern.java.Log;

/**
 * 双检锁/双重校验锁（DCL，即 double-checked locking）.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-06-30 20:24
 **/
@Log
public class DoubleCheckL {

//  这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
//  getInstance() 的性能对应用程序很关键。

  private DoubleCheckL() {
  }

  private volatile static DoubleCheckL instance;

  /**
   * 获取DoubleCheckL的实例
   */
  public static DoubleCheckL getInstance() {
    if (instance == null) {
      synchronized (DoubleCheckL.class) {
        if (instance == null) {
          instance = new DoubleCheckL();
        }
      }
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
