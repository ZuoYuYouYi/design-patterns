package org.zuoyu.util;

import lombok.extern.java.Log;

/**
 * 枚举式.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-06-30 20:39
 **/
@Log
public enum Enumerate {
  /**
   * 实例
   */
  INTERFACE;

  /**
   * 显示该类的信息
   */
  public void showClassMessage() {
    log.info(this.toString());
  }
}
