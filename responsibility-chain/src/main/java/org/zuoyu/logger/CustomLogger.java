package org.zuoyu.logger;

import lombok.extern.java.Log;
import org.zuoyu.entity.AbstractLogger;
import org.zuoyu.entity.Level;

/**
 * 自定义日志.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-07-24 16:13
 **/
@Log
public class CustomLogger extends AbstractLogger {

  public CustomLogger(Level level) {
    this.level = level;
  }

  @Override
  protected void write(String message) {
    log.info(this.level + ":\t" + message);
  }
}
