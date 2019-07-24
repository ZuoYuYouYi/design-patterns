package org.zuoyu.entity;

import lombok.extern.java.Log;

/**
 * 记录器.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-07-24 15:28
 **/
@Log
public abstract class AbstractLogger {

  protected Level level;

  protected AbstractLogger nextLogger;

  public void setNextLogger(AbstractLogger logger) {
    this.nextLogger = logger;
  }

  public void logMessage(Level level, String message) {
    if (this.level.getIndex() <= level.getIndex()) {
      write(message);
    }
    if (this.nextLogger != null) {
      this.nextLogger.logMessage(level, message);
    }
  }

  public void logMessage(String message){
    if (this.level == null){
      log.warning("this level is null!");
      return;
    }
    this.logMessage(this.level, message);
  }

  /**
   * 写入信息
   *
   * @param message - 信息
   */
  protected abstract void write(String message);
}
