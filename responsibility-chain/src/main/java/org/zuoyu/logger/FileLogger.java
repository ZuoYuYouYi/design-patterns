package org.zuoyu.logger;

import lombok.extern.java.Log;
import org.zuoyu.entity.AbstractLogger;
import org.zuoyu.entity.Level;

/**
 * 文件输出.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-07-24 16:02
 **/
@Log
public class FileLogger extends AbstractLogger {

  public FileLogger() {
    this.level = Level.WARNING;
    this.nextLogger = new CustomLogger(Level.ERROR);
  }

  @Override
  protected void write(String message) {
    log.info(this.level + ":\t" + message);
  }
}
