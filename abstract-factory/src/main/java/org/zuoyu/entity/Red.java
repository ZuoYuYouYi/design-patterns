package org.zuoyu.entity;

import lombok.extern.java.Log;
import org.zuoyu.faucet.Color;

/**
 * 红色.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-06-30 16:19
 **/
@Log
public class Red implements Color {

  @Override
  public void fill() {
    log.info("Filling color is red");
  }
}
