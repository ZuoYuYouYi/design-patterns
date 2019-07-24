package org.zuoyu.logger;

import lombok.extern.java.Log;
import org.zuoyu.entity.AbstractLogger;
import org.zuoyu.entity.Level;

/**
 * 控制台输出.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-07-24 15:57
 **/
@Log
public class ConsoleLogger extends AbstractLogger {

  public ConsoleLogger() {
    this.level = Level.INFO;
    AbstractLogger logger = new CustomLogger(Level.DEBUG);
    logger.setNextLogger(new FileLogger());
    this.nextLogger = logger;
  }

  @Override
  protected void write(String message) {
    log.info(this.level + ":\t" + message);
  }
}
