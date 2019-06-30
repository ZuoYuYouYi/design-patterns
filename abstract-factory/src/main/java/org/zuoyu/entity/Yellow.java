package org.zuoyu.entity;

import lombok.extern.java.Log;
import org.zuoyu.faucet.Color;

/**
 * 黄色.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-06-30 16:20
 **/
@Log
public class Yellow implements Color {

  @Override
  public void fill() {
    log.info("Filling color is yellow");
  }
}
